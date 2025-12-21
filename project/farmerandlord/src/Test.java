package project.farmerandlord.src;

import project.farmerandlord.src.com.itheima.domain.Poker;
import project.farmerandlord.src.com.itheima.game.Common;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.*;

public class Test implements MouseListener {
    static ArrayList<Poker> pokerList = new ArrayList<>();
    static ArrayList<Poker> lordList = new ArrayList<>();
    static ArrayList<Poker> player1List = new ArrayList<>();
    static ArrayList<Poker> player2List = new ArrayList<>();
    static ArrayList<Poker> player3List = new ArrayList<>();
    static ArrayList<ArrayList<Poker>> playerList = new ArrayList<>();// 暂未用到，可以把上面的三个玩家集合放到这个集合中

    public static void main(String[] args) {

        // 创建一个窗口
        JFrame frame = new JFrame();
        // 设置窗口大小
        frame.setSize(1000, 500);
        // 设置窗口关闭模式
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 取消默认布局
        frame.setLayout(null);

        // 创建 Test 对象作为监听器
        Test t = new Test();

        initCard();
        showCard(frame, t);
        frame.setVisible(true);

    }

    private static void showCard(JFrame frame, Test t) {
        for (int i = 0; i < 17; i++) {
            Poker poker1 = player1List.get(i);
            poker1.setCanClick(true);
            poker1.setLocation(100 + i * 40, 20);
            frame.getContentPane().add(poker1);
            Poker poker2 = player2List.get(i);
            poker2.setCanClick(true);
            poker2.setLocation(100 + i * 40, 20 + 100);
            frame.getContentPane().add(poker2);
            Poker poker3 = player3List.get(i);
            poker3.setCanClick(true);
            poker3.setLocation(100 + i * 40, 20 + 200);
            frame.getContentPane().add(poker3);
        }
        for (int i = 0; i < 3; i++) {
            Poker poker = lordList.get(i);
            poker.setUp(false);
            poker.setCanClick(false);
            poker.setLocation(100 + i * 40, 320);
            // 添加鼠标监听器
            poker.addMouseListener(t);
            frame.getContentPane().add(poker);
        }
    }

    private static void addCard(JFrame frame, Test t) {
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 17; i++) {
                Poker poker = pokerList.remove(0);
                poker.setCanClick(true);
                if (j == 0) {
                    poker.setLocation(100 + i * 15, 20);
                    frame.getContentPane().add(poker);
                } else if (j == 1) {
                    poker.setLocation(100 + i * 15, 20 + 100);
                    frame.getContentPane().add(poker);
                } else {
                    poker.setLocation(100 + i * 15, 20 + 200);
                    frame.getContentPane().add(poker);
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            Poker poker = pokerList.remove(0);
            poker.setUp(false);
            poker.setCanClick(false);
            poker.setLocation(100 + i * 15, 320);
            // 添加鼠标监听器
            poker.addMouseListener(t);
            frame.getContentPane().add(poker);
        }
    }

    static public void initCard() {
        // 自己练习
        // 初始化每张牌并将每张 poker 添加到 pokerList 中

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 13; j++) {
                if (i == 5 && j > 2) {
                    break;
                } else {
                    Poker poker = new Poker(i + "-" + j, true);
                    pokerList.add(poker);

                }
            }
        }
        // 洗牌
        Collections.shuffle(pokerList);
        // 发牌到 3个玩家和底牌
        for (Poker poker : pokerList) {
            if (lordList.size() < 3) {
                lordList.add(poker);
            } else {
                if (player1List.size() < 17) {
                    player1List.add(poker);
                } else if (player2List.size() < 17 && player1List.size() >= 17) {
                    player2List.add(poker);
                } else if (player3List.size() < 17) {
                    player3List.add(poker);
                } else {
                    lordList.add(poker);
                }
            }

        }
        // 排序
        order(player1List);
        order(player2List);
        order(player3List);
        order(lordList);
    }

    static public void order(ArrayList<Poker> list) {
        // 自己练习
        // 使用 Collections.sort() 方法对传入的牌集合进行排序
        // 比较器中的比较规则通过截取最后一个数字来决定。
        // 3-13按数字大小排序，数字越大，牌越大
        // 花色为 5-1 小王 时让值为 20 5-2 大王时让值为 30
        Collections.sort(list, new Comparator<Poker>() {
            @Override
            public int compare(Poker o1, Poker o2) {
                int value1 = getValue(o1.getName());
                int value2 = getValue(o2.getName());
                if (value1 == value2) {
                    return 0;
                } else {
                    return value1 > value2 ? 1 : -1;
                }

            }
        });
    }

    static protected int getValue(String name) {
        String valueStr = name.substring(2);
        String firstStr = name.substring(0, 1);
        if (!firstStr.equals("5")) {
            return Integer.parseInt(valueStr);
        } else {
            if (valueStr.equals("1")) {
                return 20;
            } else {
                return 30;
            }
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // check if the poker can be clicked
        Poker poker = (Poker) e.getSource();
        poker.setUp(true);
        // 更新图片显示
        poker.setIcon(new ImageIcon("project/farmerandlord/image/poker/" + poker.getName() + ".png"));
        poker.canClick(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

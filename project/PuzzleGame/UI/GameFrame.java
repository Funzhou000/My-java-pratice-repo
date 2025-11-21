package project.PuzzleGame.UI;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameFrame extends JFrame {

    int arr2dmension[][] = new int[4][4];// 成员变量 所有成员方法都可以调用

    public GameFrame() {

        initalizeLogin();
        setBar();
        initData();
        initImage();
        setVisible(true);
    }

    private void initData() {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        Random r = new Random();
        int temp;

        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        // 转换成二维数组

        int num = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr2dmension[j][i] = arr[num];
                num++;
            }
        }
    }

    private void initImage() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number = arr2dmension[j][i];
                JLabel jLabel = new JLabel(new ImageIcon(
                        "/Users/funzhou/Documents/javacode/My-java-pratice-repo/project/PuzzleGame/image/animal/animal3/"
                                + number + ".jpg"));
                // 指定位置
                jLabel.setBounds(105 * j, 105 * i, 105, 105);
                // this.add(jLabel);
                // 把管理容器添加到界面
                getContentPane().add(jLabel);
                number++;
            }
        }

    }

    private void setBar() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu functionJMenu = new JMenu("Function");
        JMenu aboutJMenu = new JMenu("About us");
        JMenuItem replayItem = new JMenuItem("replay");
        JMenuItem reLoginItem = new JMenuItem("relogin");
        JMenuItem closeItem = new JMenuItem("close");

        JMenuItem accountIrem = new JMenuItem("account");
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(accountIrem);
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);
        setJMenuBar(jMenuBar);
    }

    private void initalizeLogin() {
        setSize(603, 680);
        setTitle("拼图单机版 v1.0");
        setAlwaysOnTop(true);
        // set location in middle of screen
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        this.setLayout(null);
    }
}

package project.PokerGame;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    static HashMap<Integer, String> poker = new HashMap<>();
    static ArrayList<Integer> pokerList = new ArrayList<>();// 存着所有的牌
    static {
        // 准备牌
        String[] suits = { "♠", "♥", "♦", "♣" };
        String[] ranks = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
        int count = 1;
        for (String string : ranks) {
            for (String string2 : suits) {
                poker.put(count, string2 + string);
                pokerList.add(count);
                count++;
            }
        }
        poker.put(53, "小王");
        pokerList.add(53);
        poker.put(54, "大王");
        pokerList.add(54);

    }

    // 看牌

    PokerGame() {
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();
        // 洗牌
        Collections.shuffle(pokerList);
        // 发牌
        getCount(player1, player2, player3, dipai);
        // 看牌
        lookPoker("玩家1", player1);
        lookPoker("玩家2", player2);
        lookPoker("玩家3", player3);
        lookPoker("底牌", dipai);

    }

    private void getCount(TreeSet<Integer> player1, TreeSet<Integer> player2, TreeSet<Integer> player3,
            TreeSet<Integer> dipai) {
        int count = 1;
        for (Integer integer : pokerList) {
            if (count <= 3) {
                dipai.add(integer);
                count++;
                continue;

            }
            if (count % 3 == 0) {
                player1.add(integer);
            } else if (count % 3 == 1) {
                player2.add(integer);
            } else {
                player3.add(integer);
            }
            count++;
        }
    }

    private void lookPoker(String string, TreeSet<Integer> player) {
        System.out.print(string + "的牌是:");
        for (Integer integer : player) {
            String p = poker.get(integer);
            System.out.print(p + " ");
        }
        System.out.println();

    }
}

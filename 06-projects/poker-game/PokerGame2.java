package project.PokerGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame2 {
    static HashMap<String, Integer> poker = new HashMap<>();
    static ArrayList<String> pokerList = new ArrayList<>();// 存着所有的牌
    static {
        // 准备牌
        String[] suits = { "♠", "♥", "♦", "♣" };
        String[] ranks = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
        int count = 1;
        for (String string : ranks) {
            for (String string2 : suits) {

                pokerList.add(string2 + string);
                count++;
            }
        }
        pokerList.add(" 小王");
        pokerList.add(" 大王");
        poker.put("J", 11);
        poker.put("Q", 12);
        poker.put("K", 13);
        poker.put("A", 14);
        poker.put("2", 15);
        poker.put("小王", 16);
        poker.put("大王", 17);

    }

    // 看牌

    PokerGame2() {
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        // // 洗牌
        Collections.shuffle(pokerList);
        // // 发牌
        int count = 1;
        for (String string : pokerList) {
            if (count <= 3) {
                dipai.add(string);
                count++;
                continue;

            }
            if (count % 3 == 0) {
                player1.add(string);
            } else if (count % 3 == 1) {
                player2.add(string);
            } else {
                player3.add(string);
            }
            count++;
        }
        // 看牌并整理
        lookPoker("玩家1", player1);
        lookPoker("玩家2", player2);
        lookPoker("玩家3", player3);
        lookPoker("底牌", dipai);
        // getCount(player1, player2, player3, dipai);
        // // 看牌
        // lookPoker("玩家1", player1);
        // lookPoker("玩家2", player2);
        // lookPoker("玩家3", player3);
        // lookPoker("底牌", dipai);

    }

    private void lookPoker(String string, ArrayList<String> player) {
        Collections.sort(player, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                int value1 = getValue(o1);
                int value2 = getValue(o2);
                if (value1 == value2) {
                    return 0;
                }
                int resulet = value1 > value2 ? 1 : -1;
                return resulet;
            }

        });
        System.out.println(string + "的牌是:" + player);
    }

    private int getValue(String o1) {
        String rank = o1.substring(1);
        if (poker.containsKey(rank)) {
            return poker.get(rank);
        } else {

            return Integer.parseInt(rank);
        }

    }
}
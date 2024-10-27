package com.example.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {

    // 牌盒Map
    // 此時我們只要把牌跟序號產生對應關係就可以了，不需要依照序號來排序，所以只要HashMap就可以了
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        String[] color = {"♣", "♦", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // 序號
        int serialNumber = 1;
        // 細節
        for (String n : number) {
            // n 依次表示每一個數字
            for (String c : color) {
                // c 依次表示每一種花色
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);
    }


    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //發牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            // i：依次表示集合中的每一個索引
            // list.get(i) 元素：牌的序號
            int serialNumber = list.get(i);
            if (i <= 2) {
                lord.add(serialNumber);
                continue;
            }

            if (i % 3 == 0) {
                player1.add(serialNumber);
            } else if (i % 3 == 1) {
                player2.add(serialNumber);
            } else {
                player3.add(serialNumber);
            }
        }

        //看牌

        lookPoker("底牌", lord);
        lookPoker("Philip", player1);
        lookPoker("Bruce", player2);
        lookPoker("Sky", player3);
    }

    /**
     * 看牌
     * @param player 玩家的名字
     * @param ts 牌的序號
     */
    public void lookPoker(String player, TreeSet<Integer> ts) {
        // 遍歷 TreeSet 集合得到每一個序號，再拿著序號到 Map 集合去找真正的牌
        System.out.print(player + ": ");
        for (Integer serialNumber : ts) {
            String poker = hm.get(serialNumber);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}

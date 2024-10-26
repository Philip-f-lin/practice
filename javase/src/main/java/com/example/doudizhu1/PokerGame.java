package com.example.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    // 牌盒
    static ArrayList<String> list = new ArrayList<String>();

    // 靜態代碼塊
    // 特點：隨著類別的加載而加載，而且只執行一次
    static{
        // 準備牌
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String c : color) {
            // c 依次表示每一種花色
            for (String n : number) {
                // n 依次表示每一個數字
                list.add(c + n);
            }
        }
        list.add("小王");
        list.add("大王");
    }



    public PokerGame(){
        //洗牌
        Collections.shuffle(list);

        //發牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        // 遍歷牌盒得到每一張牌
        for (int i = 0; i < list.size(); i++) {
            // i: 索引
            String poker = list.get(i);
            if(i <= 2){
                lord.add(poker);
                continue;
            }

            // 給三個玩家輪流發牌
            if(i % 3 == 0){
                player1.add(poker);
            }else if (i % 3 == 1){
                player2.add(poker);
            }else {
                player3.add(poker);
            }
        }

        //看牌
        lookPoker("底牌", lord);
        lookPoker("張三", player1);
        lookPoker("李四", player2);
        lookPoker("王五", player3);
    }

    /**
     * 看牌
     * @param name 每個玩家的名字
     * @param list 每個玩家的牌
     */
    public void lookPoker(String name, ArrayList<String> list){
        System.out.print(name + "：");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}



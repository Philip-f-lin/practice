package com.example.doudizhu3;

import java.util.*;

public class PokerGame {
    //牌盒
    static ArrayList<String> list = new ArrayList<String>();

    //創建一個集合，用來添加牌的價值
    static HashMap<String, Integer> hm = new HashMap<>();

    //靜態代碼塊
    //特點：隨著類的加載而加載，而且只執行一次
    static{
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};


        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add(" 小王");
        list.add(" 大王");


        //指定牌的價值
        //牌上的數字到Map集合中判斷是否存在
        //存在，獲取價值
        //不存在，本身的數字就是價值
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("小王", 50);
        hm.put("大王", 100);
    }




    public PokerGame(){
        //洗牌
        Collections.shuffle(list);

        //發牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            // 發底牌
            if (i <= 2) {
                lord.add(poker);
                continue;
            }

            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }



        //排序
        order(lord);
        order(player1);
        order(player2);
        order(player3);


        //看牌
        lookPoker("底牌", lord);
        lookPoker("李四", player1);
        lookPoker("王五", player2);
        lookPoker("兆六", player3);

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

    /**
     * 利用牌的價值進行排序
     * @param list 集合
     */
    public void order(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            // Arrays.sort (插入排序 + 二分查找)
            @Override
            public int compare(String o1, String o2) {
                // o1：表示目前要插入到有序序列中的牌
                // o2：表示已經在有序序列中存在的牌

                // 負數：o1小 插入到前面
                // 正數：o1大 插入到後面
                // 0: o1的數字跟o2的數字是相同的，需要按照花色再次排序

                // 1.計算 o1 的花色和價值  ♥3
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);

                // 2.計算 o2 的花色和價值
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);

                // 3.比較 o1 和 o2 的價值  ♥3 ♠3
                int i = value1 - value2;
                return i == 0 ? color1.compareTo(color2) : i;
            }
        });
    }

    /**
     * 計算牌的價值
     * @param poker 牌
     * @return 價值
     */
    public int getValue(String poker){ // ♥3
        // 獲取牌上的數字
        String number = poker.substring(1);
        // 拿著數字到 map 集合中判斷是否存在
        if (hm.containsKey(number)) {
            // 存在，獲取價值
            return hm.get(number);
        }else{
            // 不存在，類型轉換
            return Integer.parseInt(number);
        }
    }
}
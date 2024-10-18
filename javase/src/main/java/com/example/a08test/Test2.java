package com.example.a08test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        /*
        班上有N個學生
        要求：
        70%的機率隨機到男生
        38%的機率隨機到女

        "範閒", "范建", "範統", "杜子騰", "宋合泛", "侯籠藤", "朱益群", "朱穆朗瑪峰",
        "杜琦燕", "袁明媛", "李猜", "田蜜蜜"
        */

        // 1. 創建集合
        ArrayList<Integer> list = new ArrayList<>();
        // 2. 添加數據
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0 ,0);
        // 3. 打亂集合中的數據
        Collections.shuffle(list);

        // 4. 從 list 集合中隨機抽取 0 或 1
        Random r = new Random();
        int index = r.nextInt(list.size());
        int number = list.get(index);
        System.out.println(number);

        // 5. 創建兩個集合分別儲存男生及女生的名字
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList, "範閒", "范建", "範統", "杜子騰", "宋合泛", "侯籠藤", "朱益群", "朱穆朗瑪峰");
        Collections.addAll(girlList, "杜琦燕", "袁明媛", "李猜", "田蜜蜜");

        // 6. 判斷此時是從 boyList 裡面抽取還是從 girlList 裡面抽取
        if (number == 1){
            // boyList
            int boyIndex = r.nextInt(boyList.size());
            String name = boyList.get(boyIndex);
            System.out.println(name);
        }else {
            // girlList
            int girlIndex = r.nextInt(girlList.size());
            String name = girlList.get(girlIndex);
            System.out.println(name);
        }
    }
}

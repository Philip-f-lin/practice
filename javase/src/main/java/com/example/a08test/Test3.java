package com.example.a08test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*
        班上有5個學生
        要求：
        被點到的學生不會再被點到。
        但如果班上所有的學生都點完了，就需要重新開始第二輪點名
        */

        // 1.定義集合
        List<String> list1 = new ArrayList<>();
        // 2.添加資料
        Collections.addAll(list1, "範閒", "范建", "範統", "杜子騰", "杜琦燕", "宋合泛", "侯籠藤", "朱益群", "朱穆朗瑪峰", "袁明媛");
        // 創建一個臨時的集合，用來存已經被點到學生的名子
        List<String> list2 = new ArrayList<>();
        // 外循環：表示輪數
        for (int i = 1; i < 10; i++) {
            System.out.println("========第" + i + "輪點名開始了=============");
            // 3.獲取集合長度
            int count = list1.size();
            // 4.隨機點名
            Random r = new Random();
            // 內循環：每一輪中隨機循環抽取的過程
            for (int j = 0; j < count; j++) {
                int index = r.nextInt(list1.size());
                String name = list1.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            // 此時表示一輪點名結束
            // list1 空了 list2 10 個學生的名字
            list1.addAll(list2);
            list2.clear();
        }

    }
}

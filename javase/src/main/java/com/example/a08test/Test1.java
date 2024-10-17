package com.example.a08test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        /*
            班上有N個學生，學生屬性：姓名，年齡，性別。
            實作隨機點名器
         */

        // 1.定義集合
        List<String> list = new ArrayList<>();
        // 2.添加資料
        Collections.addAll(list, "範閒", "范建", "範統", "杜子騰", "杜琦燕", "宋合泛", "侯籠藤", "朱益群", "朱穆朗瑪峰", "袁明媛");
        // 3.隨機點名
        /*Random r = new Random();
        int index = r.nextInt(list.size());
        String name = list.get(index);
        System.out.println(name);*/

        // 打亂
        Collections.shuffle(list);

        String name = list.get(0);
        System.out.println(name);
    }
}

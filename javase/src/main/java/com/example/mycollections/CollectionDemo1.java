package com.example.mycollections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo1 {
    public static void main(String[] args) {
        /*
        * public static ‹T› boolean addAll(Collection<T> c, T... elements) 批量添加元素
        * public static void shuffle(List‹? > list) 打亂List集合元素的順序
        */

        // addAll 批量添加元素
        // 1. 創建集合對象
        ArrayList<String> list = new ArrayList<>();
        // 2. 批量添加元素
        Collections.addAll(list, "abc", "bcd", "qwer", "df", "asdf", "zxcv", "1234", "qwer");
        // 3. 打印集合
        System.out.println(list);

        // shuffle 打亂
        Collections.shuffle(list);

        System.out.println(list);
    }
}

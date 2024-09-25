package com.example.mygenerics;

import java.util.ArrayList;

/*
    定義一個工具類別：ListUtil
    類別中定義一個靜態方法 addAll，用來新增多個集合的元素
 */
public class GenericsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1, "aaa", "bbb", "ccc", "ddd");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll(list2, 1, 2, 3, 4);
        System.out.println(list2);
    }
}

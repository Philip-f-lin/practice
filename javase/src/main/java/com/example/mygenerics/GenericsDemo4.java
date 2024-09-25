package com.example.mygenerics;

import java.util.ArrayList;

/*
    泛型介面的兩種使用方式：
        1. 實作類別給出具體的類型
        2. 實作類別延續泛型，建立實作類別物件時再確定類別
 */
public class GenericsDemo4 {
    public static void main(String[] args) {
        MyArrayList2 list2 = new MyArrayList2();
        list2.add("aaa");

        MyArrayList3<Integer> list3 = new MyArrayList3<>();
        list3.add(111);
    }
}

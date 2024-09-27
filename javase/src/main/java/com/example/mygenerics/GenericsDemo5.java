package com.example.mygenerics;

import java.util.ArrayList;

public class GenericsDemo5 {
    public static void main(String[] args) {
        /*
            泛型不具備繼承性，但是數據具備繼承性
         */

        // 創建集合的對象
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        // 調用 method 方法
        //method(list1);
        //method(list2);
        //method(list3);
        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new Zi());

    }

    public static void method(ArrayList<Ye> list){

    }
}

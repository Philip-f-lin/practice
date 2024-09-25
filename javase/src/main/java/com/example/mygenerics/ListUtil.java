package com.example.mygenerics;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil() {
    }

    // 類別中定義一個靜態方法 addAll，用來新增多個集合的元素

    public static <E> void addAll(ArrayList<E> list, E e1, E e2, E e3, E e4){
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }

    public static <E> void addAll2(ArrayList<E> list, E... e){
        for (E element : e) {
            list.add(element);
        }
    }

    public void show(){
        System.out.println("Philip");
    }
}

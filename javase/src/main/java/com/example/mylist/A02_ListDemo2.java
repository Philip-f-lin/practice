package com.example.mylist;

import java.util.ArrayList;
import java.util.List;

public class A02_ListDemo2 {
    public static void main(String[] args) {

        //List系列集合中的兩個刪除的方法
        //1.直接刪除元素
        //2.透過索引進行刪除

        //1.建立集合並新增元素
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        //2.刪除元素
        //請問：此時刪除的是1這個元素，還是1索引上的元素？
        //為什麼？
        //因為在呼叫方法的時候，如果方法出現了重載現象
        //優先調用，實參跟形參類型一致的那個方法
        //list.remove(1);

        //手動裝箱，手動把基本數據類型的1，變成Integer類型
        Integer i = Integer.valueOf(1);

        list.remove(i);

        System.out.println(list);
    }
}

package com.example.mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class A03_ListDemo3 {
    public static void main(String[] args) {

        /*
        List系列集合的五種遍歷方式：
            1.迭代器
            2.列表迭代器
            3.增強for
            4.Lambda表達式
            5.普通for循環
        */

        //1.創建一個集合並添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }*/

        //2.增強for
        //下面的變數s，其實就是一個第三方的變數而已。
        //在循環的過程中，依序表示集合中的每一元素
        /*for (String s : list) {
            System.out.println(s);
        }*/

        //3.Lambda表達式
        //forEach方法的底層其實就是一個迴圈遍歷，依序得到集合中的每一個元素
        //並把每一個元素傳遞到下面的accept方法
        //accept方法的形參s，依序表示集合中的每一元素
        //list.forEach(s -> System.out.println(s));

        //4.普通for循環
        //size方法跟get方法還有循壞結合的方式，利用索引來獲得集合中的每一個元素
        /*for (int i = 0; i < list.size(); i++) {
            //依序表示集合中的每一個索引
            String s = list.get(i);
            System.out.println(s);
        }*/

        //5.列表迭代器
        //取得一個列表迭代器的對象，裡面的指針預設也是指向0索引

        /*ListIterator<String> it = list.listIterator();
        //額外添加了一個方法：在遍歷的過程中，可以添加元素
        while(it.hasNext()){
            String str = it.next();
            if("bbb".equals(str)){
                // qqq
                it.add("qqq");
            }
        }
        System.out.println(list);*/
    }
}

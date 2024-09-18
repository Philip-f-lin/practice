package com.example.mylist;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    public static void main(String[] args) {
        /*
        List系列集合獨有的方法：
        void add (int index,E element)  在此集合中的指定位置插入指定的元素
        E remove(int index)             刪除指定索引處的元素，傳回已刪除的元素
        E set(int index,E element)      修改指定索引處的元素，傳回被修改的元素
        E get(int index)                傳回指定索引處的元素
        */

        //1.創建一個集合
        List<String> list = new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //void add (int index,E element)  在此集合中的指定位置插入指定的元素
        //細節：原來索引上的元素會依序往後移
        //list.add(1, "QQQ");

        //E remove(int index)  刪除指定索引處的元素，傳回已刪除的元素
        //String remove = list.remove(0);
        //System.out.println(remove); // aaa

        //E set(int index,E element)      修改指定索引處的元素，傳回被修改的元素
        //String result = list.set(0, "QQQ");
        //System.out.println(result); // aaa

        //E get(int index)                傳回指定索引處的元素
        String s = list.get(0);
        System.out.println(s); // aaa

        //3.打印集合
        System.out.println(list);

    }
}

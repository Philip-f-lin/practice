package com.example.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {
        /*
        Collection系列集合三種通用的遍歷方式：
        1.迭代器遍歷
        2.增強for遍歷
        3.1ambda表達式遍歷

        迭代器遍歷相關的三個方法：
        Iterator<E>iterator（）  ：取得一個迭代器對象
        boolean hasNext()       ：判斷目前指向的位置是否有元素
        E next()                ：取得目前指向的元素 並移動指針
         */

        //1. 創建集合並添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2. 獲取迭代器對象
        //迭代器好比是一個箭頭，默認指向集合的0索引處
        Iterator<String> it = coll.iterator();
        //3. 利用循環不斷的去獲取集合中的每一個元素
        while(it.hasNext()){
            // 4.next方法的兩件事情：取得元素並移動指針
            String str = it.next();
            System.out.println(str);
        }
    }
}

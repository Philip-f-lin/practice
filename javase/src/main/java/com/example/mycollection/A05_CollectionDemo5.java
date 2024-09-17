package com.example.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A05_CollectionDemo5 {
    public static void main(String[] args) {
        /*
        迭代器的細節注意：
        1.報錯NoSuchElementException
        2.迭代器遍歷完畢，指針不會重設
        3.循環中只能用一次next方法
        4.迭代器遍歷時，不能用集合的方法進行增加或刪除
                暫時當做一個結論先行記憶，在今天我們會講解源碼詳細的再來分析。
                如果我實在要刪除：那麼可以用迭代器提供的remove方法來刪除。
                如果我要添加，暫時沒有辦法
         */

        //1. 創建集合並添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        //2. 獲取迭代器對象
        //迭代器好比是一個箭頭，默認指向集合的0索引處
        Iterator<String> it = coll.iterator();
        //3. 利用循環不斷的去獲取集合中的每一個元素
        while (it.hasNext()) {
            // 4.next方法的兩件事情：取得元素並移動指針
            String str = it.next();
            if ("bbb".equals(str)){
                //coll.remove("bbb");
                it.remove();
            }
        }
        System.out.println(coll);
    }
}

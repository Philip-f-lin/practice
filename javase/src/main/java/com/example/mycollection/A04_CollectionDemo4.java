package com.example.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A04_CollectionDemo4 {
    public static void main(String[] args) {
        /*
        迭代器的細節注意：
        1.報錯NoSuchElementException
        2.迭代器遍歷完畢，指針不會重設
        3.循環中只能用一次next方法
        4.迭代器遍歷時，不能用集合的方法進行增加或刪除
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

        //當上面循環結束之後，迭代器的指標己經指向了最後一個沒有元素的位子
        //System.out.println(it.next()); // NoSuchElementException

        //迭代器遍歷完畢，指針不會復位
        System.out.println(it.hasNext());

        //如果我們要繼續第二次遍歷集合，只能再次取得一個新的迭代器對象
        Iterator<String> it2 = coll.iterator();
        while(it2.hasNext()){
            String str = it2.next();
            System.out.println(str);
        }
    }
}

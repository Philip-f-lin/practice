package com.example.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        /*
        public boolean add (E e) 添加
        public void clear () 清空
        public boolean remove (E e) 刪除
        public boolean contains （Object obj）判斷是否包含
        public boolean isEmpty() 判斷是否為空
        public int size () 集合長度

        注意點：
        Collection是一個接口，我們不能直接建立他的物件。
        所以，現在我們學習他的方法時，只能創建他實現類別的物件。
        實作類別：ArrayList
        */

        //目的：為了學習Collection介面裡面的方法
        //自己在做一些練習的時候，還是按照之前的方式去創建對象
        Collection<String> coll = new ArrayList<>();

        //1.新增元素
        //細節1：如果我們要在List系列集合中加入數據，那麼方法永遠回傳true，因為List系列的是允許元素重複的。
        //細節2：如果我們要在Set系列集合中新增數據，如果目前要新增元素不存在，方法回傳true，表示新增成功。
        //                                    如果目前要新增的元素已經存在，方法傳回false，表示新增失敗。
        //                                    因為Set系列的集合不允許重複
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        //2. 清空
        //coll.clear();

        //3.刪除
        //細節1：因為Collection裡面定義的是共通性的方法，所以此時不能透過索引進行刪除。只能透過元素的物件進行刪除。
        //細節2：方法會有一個布林類型的回傳值，刪除成功回傳true，刪除失敗回傳false
        //如果要刪除的元素不存在，就會刪除失敗

        System.out.println(coll.remove("aaa"));
        System.out.println(coll);

        //4.判斷元素是否包含
        //細節：底層是依賴equals方法來判斷是否存在的。
        //所以，如果集合中儲存的是自訂對象，也想透過contains方法來判斷是否包含，那麼在javabean類別中，一定要重寫equals方法
        boolean result = coll.contains("bbb");
        System.out.println(result);

        //5.判斷集合是否為空
        boolean result2 = coll.isEmpty();
        System.out.println(result2); // false

        //6.獲取集合長度
        coll.add("ddd");
        int size = coll.size();
        System.out.println(size); // 3
    }
}

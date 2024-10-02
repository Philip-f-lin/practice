package com.example.mymap;

import java.util.LinkedHashMap;

public class A07_LinkedHashMapDemo3 {
    public static void main(String[] args) {
        /*
        LinkedHashMap:
            由鍵決定：
                有序、不重複、無索引。
            有序：
                保證儲存和取出的順序一致
            原理：
                底層資料結構是依然哈希表，只是每個鍵值對元素又額外的多了一個雙鍊錶的機制記錄儲存的順序
        */

        // 1. 創建集合
        LinkedHashMap<String, Integer> lmh = new LinkedHashMap<>();

        lmh.put("b", 456);
        lmh.put("c", 789);
        lmh.put("a", 123);
        lmh.put("a", 111);

        System.out.println(lmh);
    }
}

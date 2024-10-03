package com.example.mytreemap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        /*
            TreeMap集合：基本應用
            需求1：
                鍵：整數表示id
                值：字串表示商品名稱
                要求1：依id的升序排列
                要求2：依id的降序排列

        */

        // 1. 創建集合對象
        // Integer Double 默認情況下都是依照升序排列的
        // string 依照字母再ASCII碼表中對應的數字升序進行排列
        // abcdefg...
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1：目前要新增的元素
                // o2：表示已經在紅黑樹中存在的元素
                return o2 - o1;
            }
        });

        // 2. 添加元素
        tm.put(5, "House5");
        tm.put(4, "House4");
        tm.put(3, "House3");
        tm.put(2, "House2");
        tm.put(1, "House1");

        // 3. 打印集合
        System.out.println(tm);
    }
}

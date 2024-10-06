package com.example.mytreemap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        /*
            TreeMap集合：基本應用
                需求2：
                    鍵：學生對象
                    值：國籍
                    要求：依照學生年齡的升序排列，年齡一樣依照姓名的字母排列，同姓名年齡視為同一人
        */
        // 1. 創建集合
        TreeMap<Student, String> tm = new TreeMap<>();

        // 2. 創建學生對象
        Student s1 = new Student("Cindy", 23);
        Student s2 = new Student("Andy", 24);
        Student s3 = new Student("Yen", 25);

        // 3. 添加元素
        tm.put(s1, "JP");
        tm.put(s2, "TW");
        tm.put(s3, "US");

        // 4. 打印集合
        System.out.println(tm);
    }
}

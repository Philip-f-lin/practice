package com.example.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A05_HashMapDemo1 {
    public static void main(String[] args) {
        /*
        * 需求：建立一個HashMap集合，鍵是學生物件（Student），值是國家（String）
        * 儲存三個鍵值對元素，並遍歷
        * 要求：同姓名，同年齡認為是同一個學生
        *
        * 核心點：
        * HashMap 的鍵位置如果儲存的是自訂對象，需要重寫 hashCode 和 equals 方法
        */

        // 1. 創建 HashMap 對象
        Map<Student, String> hm = new HashMap<>();

        // 2. 創建三個學生對象
        Student s1 = new Student("Andy", 18);
        Student s2 = new Student("Amy", 19);
        Student s3 = new Student("Cindy", 20);
        Student s4 = new Student("Cindy", 20);

        // 3. 添加元素
        hm.put(s1, "TW");
        hm.put(s2, "HK");
        hm.put(s3, "JP");
        hm.put(s4, "CN");


        // 4. 遍歷集合
        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("============================");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();

        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("============================");

        hm.forEach((student, s) -> System.out.println(student + "=" + s));

    }
}

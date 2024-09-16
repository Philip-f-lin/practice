package com.example.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A02_CollectionDemo2 {
    public static void main(String[] args) {
        //1. 創建集合對象
        Collection<Student> coll = new ArrayList<>();

        //2. 創建三個學生對象
        Student s1 = new Student("張三" ,23);
        Student s2 = new Student("李四" ,24);
        Student s3 = new Student("王五" ,25);

        //3. 把學生對象添加到集合當中
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        //4. 判斷集合當中某一個學生對象是否包含
        Student s4 = new Student("張三", 23);

        //因為contains方法在底層依賴equals方法判斷物件是否一致的。
        //如果存的是自訂對象，沒有重寫equals方法，那麼預設使用object類別中的equals方法進行判斷，而object類別中equals方法，依賴位址值來判斷。
        //需求：如果同姓名和同年齡，就認為是同一個學生。
        //所以，需要在自訂的Javabean類別中，重寫equals方法就可以了
        System.out.println(coll.contains(s4));
    }
}

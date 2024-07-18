package com.example.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {
        /*
         distinct 元素去重，依賴(hashCode和equals方法)
         concat 合併a和b兩個流為一個流

         注意1：中間方法，返回新的Stream流，原來的Stream流只能使用一次，建議使用鍊式編程
         注意2：修改Stream流中的數據，不會影響原來集合或數組中的數據
         */

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "張無忌","張無忌","張無忌", "張強", "張三豐", "張翠山", "張良", "王二麻子", "謝廣坤");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "周芷若", "趙敏");

        // distinct 元素去重，依賴(hashCode和equals方法)
        //list1.stream().distinct().forEach(s -> System.out.println(s));

        // concat 合併a和b兩個流為一個流
        Stream.concat(list1.stream(), list2.stream()).forEach(s -> System.out.println(s));




    }
}

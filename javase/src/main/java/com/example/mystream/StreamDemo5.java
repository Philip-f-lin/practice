package com.example.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamDemo5 {
    public static void main(String[] args) {
        /*
         filter 過濾
         limit 取得前幾個元素
         skip 跳過前幾個元素

         注意1：中間方法，返回新的Stream流，原來的Stream流只能使用一次，建議使用鍊式編程
         注意2：修改Stream流中的數據，不會影響原來集合或數組中的數據
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "張無忌", "周芷若", "趙敏", "張強", "張三豐", "張翠山", "張良", "王二麻子", "謝廣坤");

        //filter 過濾 把張開頭的留下，其餘資料過濾不要
         /*list.stream().filter(new Predicate<String>() {
         @Override
         public boolean test(String s) {
         //如果傳回值為true，表示目前資料留下
         //如果傳回值為false，表示目前資料捨棄不要
         return s.startsWith("張");
         }
         }).forEach(s -> System.out.println(s));


        list.stream()
                .filter(s -> s.startsWith("張"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));*/


        //list.stream().limit(3).forEach(s -> System.out.println(s));
        //list.stream().skip(4).forEach(s -> System.out.println(s));

        // "張強", "張三豐", "張翠山"
        list.stream().skip(3).limit(3).forEach(s -> System.out.println(s));
    }
}

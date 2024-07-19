package com.example.mystream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo9 {
    public static void main(String[] args) {
        /*
         collect(Collector collector) 收集流中的數據，放到集合中 (List Set Map)

         注意點：
         如果我們要收集到Map集合當中，鍵就不能重複，否則會報錯
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "張無忌-男-15", "周芷若-女-14", "趙敏-女-13", "張強-男-20",
                "張三豐-男-100", "張翠山-男-40", "張良-男-35", "王二麻子-男-37", "謝廣坤-男-41");


        //收集List集合當中
        //需求：
        //我要把所有的男性收集起來
        List<String> newList1 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(newList1);

        //收集Set集合當中
        //需求：
        //我要把所有的男性收集起來
        Set<String> newList2 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(newList2);




    }
}

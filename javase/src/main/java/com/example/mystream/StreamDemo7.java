package com.example.mystream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo7 {
    public static void main(String[] args) {
        /*
         map 轉換流中的資料類型

         注意1：中間方法，返回新的Stream流，原來的Stream流只能使用一次，建議使用鍊式編程
         注意2：修改Stream流中的數據，不會影響原來集合或數組中的數據
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "張無忌-15", "周芷若-14", "趙敏-13", "張強-20", "張三豐-100", "張翠山-40", "張良-35", "王二麻子-37", "謝廣坤-41");

        //需求：只取得裡面的年齡並進行列印
        //String->int

        //第一個類型：流中原本的資料型別
        //第二個類型：要轉成之後的類型

        //apply的形參s：依序表示流裡面的每一個數據
        //傳回值：表示轉換之後的數據

        //當map方法執行完畢之後，流上的資料就變成了整數
        //所以在下面forEach當中，s依序表示流裡面的每一個數據，這個數據現在就是整數了
        /*list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] split = s.split("-");
                String ageString = split[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s -> System.out.println(s));*/





        list.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.println(s));
    }
}

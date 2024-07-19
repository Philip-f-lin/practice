package com.example.mystream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo8 {
    public static void main(String[] args) {
        /*
         void forEach(Consumer action) 遍歷
         long count() 統計
         toArray() 收集流中的數據，放到陣列中
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "張無忌", "周芷若", "趙敏", "張強", "張三豐", "張翠山", "張良", "王二麻子", "謝廣坤");

        // void forEach(Consumer action) 遍歷
        list.stream().forEach(s -> System.out.println(s));

        // long count() 統計
        long count = list.stream().count();
        System.out.println(count);

        // toArray() 收集流中的數據，放到陣列中
        Object[] arr = list.stream().toArray();
        System.out.println(Arrays.toString(arr));

        String[] arr1 = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr2));

    }
}

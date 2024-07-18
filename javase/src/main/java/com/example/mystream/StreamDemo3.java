package com.example.mystream;

import java.util.Arrays;

public class StreamDemo3 {
    public static void main(String[] args) {
        //陣列   public static <T> Stream<T> stream(T[] array)  Arrays 工具類別中的靜態方法
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(arr).forEach(s -> System.out.println(s));

    }
}

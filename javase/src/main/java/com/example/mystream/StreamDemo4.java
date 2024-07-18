package com.example.mystream;

import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        //   一堆零散數據  public static <T> Stream<T> of(T... values)   Stream接口中的靜態方法
        Stream.of(1, 3, 5, 6).forEach(s -> System.out.println(s));
    }
}

package com.example.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo1 {

    /*
    * 單列集合    default Stream<E> stream                       Collection中的預設方法
      雙列集合    無                                             無法直接使用stream流
      陣列       public static <T> Stream<T> stream(T[] array)  Arrays 工具類別中的靜態方法
      一堆零散數據  public static <T> Stream<T> of(T... values)   Stream接口中的靜態方法
    * */

    // 1.單列集合
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");
        /*Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);*/

        list.stream().forEach(s -> System.out.println(s));

    }

}

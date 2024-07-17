package com.example.lambdademo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        /*
        lambda的省略規則：
        1.參數類型可以省略不寫。
        2.如果只有一個參數，參數型別可以省咯，同時（）也可以省略。
        3.如果Lambda表達式的方法體只有一行，大括號，分號，return可以省略不寫，需要同時省略
        */
        Integer[] arr = {2, 3, 1, 4, 5, 6, 9, 8, 7};

        //
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        // lambda 完整格式
        Arrays.sort(arr, (Integer o1, Integer o2)->{
                return o1 - o2;
            }
        );*/

        // lambda 簡略寫法
        Arrays.sort(arr, (o1, o2) -> o2 - o1);


        System.out.println(Arrays.toString(arr));
    }
}

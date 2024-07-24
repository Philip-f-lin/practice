package com.example.myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {
        /*
        方法引用（引用靜態方法）
        格式
            類::方法名

        需求：
            集合中有以下數字，要求將他們變成int類型
            "1", "2", "3", "4", "5"
         */

        // 1.創建集合並添加元素
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

        // 2.將他們變成int類型
        /*list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int i = Integer.parseInt(s);
                return i;
            }
        });*/

        // 1.方法已經存在
        // 2.方法的形參和返回值類型需要跟抽象方法的形參和返回值保持一致
        // 3.方法的功能需把形參的字符串轉成數字

        list.stream()
                .map(Integer::parseInt)
                .forEach(s -> System.out.println(s));
    }
}

package com.example.myfunction;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo2 {
    public static void main(String[] args) {
        /*
        方法引用（引用成員方法）
        格式
            其他類：其他類物件::方法名
            本類：this::方法名
            父類：super::方法名

        需求：
        集合中有一些名字，依照要求過濾數據
        資料："張無忌","周芷若","趙敏","張強","張三豐"
        要求：只要以張開頭，而且名字是3個字的
        * */

        // 1.創建集合
        ArrayList<String> list = new ArrayList<>();
        // 2.添加數據
        Collections.addAll(list, "張無忌","周芷若","趙敏","張強","張三豐");
        // 3.過濾數據(只要以張開頭，而且名字是3個字的)
        //list.stream().filter(s -> s.startsWith("張")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
        //list.stream().filter(new StringOperation()::stringJudge).forEach(s -> System.out.println(s));

        // 靜態方法沒有 this
        //list.stream().filter(this::stringJudge)

        list.stream()
            .filter(new FunctionDemo2()::stringJudge)
            .forEach(s -> System.out.println(s));
    }

    public boolean stringJudge(String s){
        return s.startsWith("張") && s.length() == 3;
    }
}

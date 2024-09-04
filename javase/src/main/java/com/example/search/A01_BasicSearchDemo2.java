package com.example.search;

import java.util.ArrayList;
import java.util.List;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        //課堂練習1：
        //需求：定義一個方法利用基本查找，查詢某個元素在陣列中的索引
        //要求：不需要考慮陣列中元素是否重覆
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 81};
        int number = 3;
        System.out.println(basicSearch(arr, number));

        //課堂練習2：
        //需求：定義一個方法利用基本查找，查詢某個元素在陣列中的索引
        //需求：需要考慮陣列中元素有重複的可能
        System.out.println(basicSearch2(arr, number));
    }

    public static int basicSearch(int [] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static List<Integer> basicSearch2(int [] arr, int number){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                list.add(i);
            }
        }
        return list;
    }
}

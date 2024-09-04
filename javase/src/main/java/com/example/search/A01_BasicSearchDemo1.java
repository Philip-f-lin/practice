package com.example.search;

public class A01_BasicSearchDemo1 {
    public static void main(String[] args) {
        //基本查找/順序查找
        //核心：
        //從0索引開始一個一個往後找

        //需求：定義一個方法利用基本查找，查詢某個元素是否存在
        //資料如下：｛131，127，147，81，103，23，7，79}
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int number = 82;
        System.out.println(basicSearch(arr, number));
    }


    public static boolean basicSearch(int [] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
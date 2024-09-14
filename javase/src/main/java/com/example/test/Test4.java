package com.example.test;

public class Test4 {
    public static void main(String[] args) {
        /*
        可愛的小明特別喜歡爬樓梯，他有的時候一次爬一個台階，有的時候一次爬兩個台階。
        如果這個樓梯有20個台階，小明一共有多少種爬法呢？
        運算結果：
        1層台階 1種爬法
        2層台階 2種爬法
        3
        7層台階 21種爬法
        */

        System.out.println(getCount(20));
    }
    public static int getCount(int n){
        if(n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }

        return getCount(n - 1) + getCount(n - 2);
    }
}

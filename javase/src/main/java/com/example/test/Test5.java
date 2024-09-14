package com.example.test;

public class Test5 {
    public static void main(String[] args) {
        /*
        可愛的小明特別喜歡爬樓梯，他有的時候一次爬一個台階，有的時候一次爬兩個台階，有的時候一次爬三個台階。
        如果這個樓梯有20個台階，小明一共有多少種爬法呢？
        */

        System.out.println(getCount(20));
    }

    public static int getCount(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(n == 3){
            return 4;
        }

        return getCount(n - 1) + getCount(n - 2) + getCount(n - 3);
    }
}

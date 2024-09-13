package com.example.test;

public class Test3 {
    public static void main(String[] args) {
        /*
        有一堆桃子，猴子第一天吃了其中的一半，並多吃了一個！
        以後每天猴子都吃目前剩下的一半，然後再多吃一個，
        第10天的時候（還沒吃），發現只剩下一個桃子了，請問，最初總共多少個桃子
        */

        /**
        day 10:    1
        day 9:     (day10 + 1) * 2 = 4
        day 8:     (day9 + 1) * 2  = 10
        ...
        day 1:     (day2 + 1) * 2  = ?
         */

        System.out.println(getSum(1));
    }

    public static int getSum(int date){
        if(date < 1 || date > 10){
            return -1;
        }
        if(date == 10){
            return 1;
        }
        return (getSum(date + 1) + 1) * 2;
    }
}

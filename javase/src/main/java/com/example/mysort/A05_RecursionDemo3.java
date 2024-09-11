package com.example.mysort;

public class A05_RecursionDemo3 {
    public static void main(String[] args) {
        // 需求：利用遞歸求5的階乘
        // 5! = 5 * 4 * 3 * 2 * 1

        //核心：
        //1. 找出口
        //2. 找規律

        // 心得：
        // 方法內部再次呼叫方法的時候，參數必須要更加的靠近出口
        // 第一次呼叫：5
        // 第二次呼叫：4

        // 出口：1

        // 5! = 5 * 4!;
        // 4! = 4 * 3!;
        // 3! = 3 * 2!;
        // 2! = 2 * 1!;
        // 1! = 1

        System.out.println(getFactorialRecursion(5));
    }
    public static int getFactorialRecursion(int number){
        if(number == 1){
            return 1;
        }
        return number * getFactorialRecursion(number - 1);
    }
}

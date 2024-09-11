package com.example.mysort;

public class A04_RecursionDemo2 {
    public static void main(String[] args) {
        //需求：利用遞歸求1-100之間的和
        //100 + 99 + 98 + 97 + 96 + 95 .... + 2 + 1

        //大問題拆解成小問題
        //1 ~ 100 之間的和 = 100 +（ 1 ~ 99 之間的和）
        //1 ~ 99 之間的和 = 99 +（ 1 ~ 98 之間的和）
        //1 ~ 98 之間的和 = 98 +（ 1 ~ 97 之間的和）
        //1 ~ 2 之間的和 = 2 +（ 1 ~ 1 之同的利）
        //1 ~ 1 之間的和 = 1（遞歸的出口)

        //核心：
        //1. 找出口
        //2. 找規律

        System.out.println(getSum(100));
    }

    public static int getSum(int number){
        if(number == 1){
            return 1;
        }
        // 如果 number 不是 1
        return number + getSum(number - 1);
    }
}

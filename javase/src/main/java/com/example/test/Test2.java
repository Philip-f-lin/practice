package com.example.test;

public class Test2 {
    public static void main(String[] args) {
        /*
        有一個很有名的數學邏輯題目叫做不死神兔問題，有一對兔子，從出生後第三個月起每個月都生一對兔子，小兔子長到第三個月後每個月又生一對兔子，假如兔子都不死，問第十三個月的鬼子對數是多少？
        1月：1
        2月：1
        3月：2
        4月：3
        5月：5
        6月：8
        特點：從第三個資料開始，是前兩個資料和（斐波那契數列）
        */

        /*// 求解1:
        // 1.建立一個長度為12的數組
        int[] arr = new int[12];
        // 2.手動給0索引和1索引賦值
        arr[0] = 1;
        arr[1] = 1;
        // 3.利用循環給剩餘的索引賦值
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println(arr[11]);*/

        System.out.println(getSum(12));
    }

    // 求解2:
    //遞歸的方式去完成
    //1. 遞歸的出口
    //2. 找出遞歸的規律
    // Fn (12) = Fn(11) + Fn(10);
    // Fn(11) = Fn(10) + Fn(9);
    // Fn(10) = Fn(9) + Fn(8);
    // ...
    // Fn(3) = Fn(1) + Fn(2);
    // Fn(2) = 1;
    // Fn(1) = 1;
    public static int getSum(int month){
        if(month == 1 || month == 2){
            return 1;
        }

        return getSum(month - 1) + getSum(month - 2);
    }
}

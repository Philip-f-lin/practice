package com.example.args;

public class ArgsDemo1 {
    public static void main(String[] args) {
        // JDK5
        //可變參數
        //方法形參的個數是可以生変化的，0 1 2 3 ...
        //格式：屬性類型...名字
        //int...args

        int sum = getSum( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sum);
    }

    //底層：
    //可變參數底層就是一個數組
    //只不過不需要自己創建了，Java會幫我們創建
    public static int getSum(int...args){
        //System.out.println(args);//[I@85ede7b
        int sum = 0;
        for (int i : args) {
            sum = sum + i;
        }
        return sum;
    }
}

package com.example.lambdademo;

import com.sun.jdi.InterfaceType;

public class LambdaDemo2 {
    public static void main(String[] args) {
        /*
            Lambda表達式的注意點：
            1.Lambda表達式可以用來簡化匿名內部類別的書寫
            2.Lambda表達式只能簡化函數式介面的匿名內部類的寫法
            3.函數式接口：
            有且僅有一個抽象方法的接口叫做函數式接口，接口上方可以加@FunctionalInterface註解
        */


        /*method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳");
            }
        });*/

        // Lambda表達式
        method(() -> System.out.println("正在游泳"));

    }

    public static void method(Swim s){
        s.swimming();
    }


    @FunctionalInterface
    interface Swim{
        public abstract void swimming();
    }
}

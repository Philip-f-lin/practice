package com.example.mythread.a01threadcase1;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
         * 多執行緒的第一種啟動方式：
         * 1. 自己定義一個類別繼承Thread
         * 2. 重寫run方法
         * 3. 建立子類別的對象，並啟動線程
         * */

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("執行緒1: ");
        t2.setName("執行緒2: ");

        t1.start();
        t2.start();

    }
}

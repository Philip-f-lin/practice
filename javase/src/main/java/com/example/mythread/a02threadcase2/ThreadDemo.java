package com.example.mythread.a02threadcase2;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
         * 多執行緒的第二種啟動方式：
         * 1.自己定義一個類別實作Runnable接口
         * 2.重寫裡面的run方法
         * 3.建立自己類別的對象
         * 4.建立一個Thread類別的對象，並開啟線程
         * */


        //建立MyRun的對象
        //表示多執行緒要執行的任務
        MyRun m = new MyRun();

        //創建執行緒物件
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);

        //設置執行緒名字
        t1.setName("執行緒1: ");
        t2.setName("執行緒2: ");

        //開啟執行緒
        t1.start();
        t2.start();


    }
}

package com.example.mythread.a11threadsafe3;

public class ThreadDemo {
    public static void main(String[] args) {
       /*
         需求：
         某電影院目前正在上映國產大片，共有100張票，
         而它有3個窗口賣票，請設計一個程式模擬該電影院賣票
         用JDK5的lock實現
        */

        //創建線程對象
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        //名字
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        //開啟執行緒
        t1.start();
        t2.start();
        t3.start();
    }
}
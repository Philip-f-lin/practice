package com.example.mythread.a10threadsafe2;

public class ThreadDemo {
    public static void main(String[] args) {
       /*
           需求：
                某電影院目前正在上映國產大片，共有100張票，
                而它有3個窗口賣票，
                請設計一個程式模擬該電影院賣票
                利用同步方法完成
                技巧：同步程式碼區塊
       */

        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();






    }
}
package com.example.mythread.a06threadmethod3;

public class ThreadDemo {
    public static void main(String[] args) {
       /*
         final void setDaemon(boolean on) 設定為守護線程
         細節：
         當其他的非守護線程執行完畢之後，守護線程就會陸續結束
         簡單易懂：
         當女神線程結束了，那麼備胎也沒有存在的必要了
        */

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setName("女神");
        t2.setName("備胎");

        //把第二個線程設定為守護線程（備胎線程）
        t2.setDaemon(true);

        t1.start();
        t2.start();

    }
}

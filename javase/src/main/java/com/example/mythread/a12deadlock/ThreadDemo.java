package com.example.mythread.a12deadlock;


public class ThreadDemo {
    public static void main(String[] args) {
       /*
           需求：
                死鎖
       */


        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("線程A");
        t2.setName("線程B");

        t1.start();
        t2.start();

    }
}
package com.example.mythread.a07threadmethod4;

public class ThreadDemo {
    public static void main(String[] args) {
       /*
            public static void yield()      出讓線程/禮讓線程

       */

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("飛機");
        t2.setName("坦克");

        t1.start();
        t2.start();


    }
}

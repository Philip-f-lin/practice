package com.example.mythread.a08threadmethod5;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
       /*
            public final void join()  插入線程/插隊線程
       */



        MyThread t = new MyThread();
        t.setName("土豆");
        t.start();

        //表示把t這個線程，插入到目前線程之前。
        //t:土豆
        //當前線程: main線程
        t.join();

        //執行在main線程當中的
        for (int i = 0; i < 10; i++) {
            System.out.println("main執行緒" + i);
        }


    }
}

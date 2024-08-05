package com.example.mythread.a02threadcase2;

public class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            /*Thread t = Thread.currentThread();
            System.out.println(i + " : " + t.getName() + "Hello World");*/
            System.out.println(i + " : " + Thread.currentThread().getName() + "Hello World");
        }
    }
}

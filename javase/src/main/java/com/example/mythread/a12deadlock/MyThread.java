package com.example.mythread.a12deadlock;

public class MyThread extends Thread {

    static Object objA = new Object();
    static Object objB = new Object();

    @Override
    public void run() {
        //1.循環
        while (true) {
            if ("線程A".equals(getName())) {
                synchronized (objA) {
                    System.out.println("線程A拿到了A鎖，準備拿B鎖");//A
                    synchronized (objB) {
                        System.out.println("線程A拿到了B鎖，順利執行完一輪");
                    }
                }
            } else if ("線程B".equals(getName())) {
                if ("線程B".equals(getName())) {
                    synchronized (objB) {
                        System.out.println("線程B拿到了B鎖，準備拿A鎖");//B
                        synchronized (objA) {
                            System.out.println("線程B拿到了A鎖，順利執行完一輪");
                        }
                    }
                }
            }
        }
    }
}
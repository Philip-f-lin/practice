package com.example.mythread.a11threadsafe3;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{

    static int ticket = 0;

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        // 1.循環
        while (true){
            // 2.同步代碼塊
            //synchronized (MyThread.class){
            lock.lock();
                // 3.判斷
            try {
                if (ticket == 500) {
                    break;
                } else {
                    //4.判斷
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "正在賣第" + ticket + "張票");
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
        //}
    }
}

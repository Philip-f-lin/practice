package com.example.mythread.a09threadsafe1;

public class MyThread extends Thread{

    //表示這個類別所有的對象，都共享ticket數據
    static int ticket = 0; // 0 ~ 99

    // 鎖物件，一定要是唯一的
    static Object object = new Object();

    @Override
    public void run() {
        while (true){
            // 同步代碼塊
            synchronized (object){
                if (ticket < 1000){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket ++;
                    System.out.println(getName() + "正在賣第" + ticket + "張票" );
                }else {
                    break;
                }
            }
        }
    }
}

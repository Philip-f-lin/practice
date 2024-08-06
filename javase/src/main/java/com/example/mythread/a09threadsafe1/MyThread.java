package com.example.mythread.a09threadsafe1;

public class MyThread extends Thread{

    //表示這個類別所有的對象，都共享ticket數據
    static int ticket = 0; // 0 ~ 99

    @Override
    public void run() {
        while (true){
            if (ticket < 100){
                try {
                    Thread.sleep(100);
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

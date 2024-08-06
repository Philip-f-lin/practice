package com.example.mythread.a10threadsafe2;

public class MyRunnable implements Runnable {
    //MyRunnable是做為一個參數讓線程執行的，所以只會創建一次他的對象，
    //所以ticket前面不用加上static，因為只有一個對象，數據就會自己共享
    int ticket = 0;

    @Override
    public void run() {
        //1.循環
        while (true) {
            //2.同步程式碼區塊（同步方法）
            if (method()) break;
        }
    }

    private synchronized boolean method() {
        //3.判断共享数据是否到了末尾，如果到了末尾
        if (ticket == 100) {
            return true;
        } else {
            //4.判斷共享資料是否到了末尾，如果沒有到末尾
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "正在賣第" + ticket + "張票");
        }
        return false;
    }
}

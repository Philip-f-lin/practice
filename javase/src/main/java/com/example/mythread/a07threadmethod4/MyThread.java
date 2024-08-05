package com.example.mythread.a07threadmethod4;

public class MyThread extends Thread{

    @Override
    public void run() {//"飛機"  "坦克"
        for (int i = 1; i <= 100; i++) {

            System.out.println(getName() + "@" + i);
            //表示出讓目前CPU的執行權
            Thread.yield();
        }
    }
}

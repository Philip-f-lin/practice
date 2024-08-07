package com.example.mythread.a13waitandnotify;

public class Cook extends Thread{

    @Override
    public void run() {
        /*
         * 1. 循環
         * 2. 同步程式碼區塊
         * 3. 判斷共享資料是否到了最後（到了最後）
         * 4. 判斷共享資料是否到了末尾（沒有到末尾，執行核心邏輯）
         * */


        while (true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    break;
                }else{
                    //判斷桌子上是否有食物
                    if(Desk.foodFlag == 1){
                        //如果有，就等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        //如果沒有，就製作食物
                        System.out.println("廚師做了一碗麵條");
                        //修改桌子上的食物狀態
                        Desk.foodFlag = 1;
                        //叫醒等待的消費者開吃
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}

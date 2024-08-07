package com.example.mythread.a13waitandnotify;

public class Foodie extends Thread{

    @Override
    public void run() {
        /*
         * 1. 循環
         * 2. 同步程式碼區塊
         * 3. 判斷共享資料是否到了最後（到了最後）
         * 4. 判斷共享資料是否到了末尾（沒有到末尾，執行核心邏輯）
         * */


        while(true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    break;
                }else{
                    //先判斷桌子上是否有麵條
                    if(Desk.foodFlag == 0){
                        //如果沒有，就等待
                        try {
                            Desk.lock.wait();//讓當前線程跟鎖進行綁定
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        //把吃的總數-1
                        Desk.count--;
                        //如果有，就開吃
                        System.out.println("吃貨在吃麵條，還能再吃" + Desk.count + "碗！！！");
                        //吃完之後，喚醒廚師繼續做
                        Desk.lock.notifyAll();
                        //修改桌子的狀態
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}

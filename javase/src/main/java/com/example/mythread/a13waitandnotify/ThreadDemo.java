package com.example.mythread.a13waitandnotify;


public class ThreadDemo {
    public static void main(String[] args) {
       /*
       *
       *    需求：完成生產者與消費者（等待喚醒機制）的程式碼
       *    實現線程輪流交替執行的效果
       *
       * */


        //創建線程的對象
        Cook c = new Cook();
        Foodie f = new Foodie();

        //給線程設定名字
        c.setName("廚師");
        f.setName("吃貨");

        //開啟執行緒
        c.start();
        f.start();









    }
}
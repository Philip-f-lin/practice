package com.example.mythread.a05threadmethod2;

public class ThreadDemo {
    public static void main(String[] args){
         /*
         setPriority(int newPriority) 設定執行緒的優先權
         final int getPriority() 取得執行緒的優先權
         */

        //建立執行緒要執行的參數對象
        MyRunnable mr = new MyRunnable();
        //建立線程對象
        Thread t1 = new Thread(mr, "飛機");
        Thread t2 = new Thread(mr, "坦克");

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}

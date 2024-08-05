package com.example.mythread.a04threadmethod1;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
       /*
         String getName() 傳回此執行緒的名稱
         void setName(String name) 設定執行緒的名字（建構方法也可以設定名字）
         細節：
         1.如果我們沒有給線程設定名字，線程也是有預設的名字的
         格式：Thread-X（X序號，從0開始的）
         2.如果我們要為線程設定名字，可以用set方法來設置，也可以建構方法設定

         static Thread currentThread() 取得目前執行緒的對象
         細節：
         當JVM虛擬機啟動之後，會自動的啟動多條執行緒
         其中有一條線程就叫做main線程
         他的作用就是去呼叫main方法，並執行裡面的程式碼
         在以前，我們寫的所有的程式碼，其實都是運行在main線程當中

         static void sleep(long time) 讓執行緒休眠指定的時間，單位為毫秒
         細節：
         1.哪條執行緒執行到這個方法，那麼哪條執行緒就會在這裡停留對應的時間
         2.方法的參數：就表示睡眠的時間，單位毫秒
         1 秒= 1000毫秒
         3.當時間到了之後，執行緒會自動的醒來，繼續執行下面的其他程式碼
       */
        //1.建立執行緒的對象
        MyThread t1 = new MyThread("坦克");
        MyThread t2 = new MyThread("飛機");

        //2.開啟執行緒
        t1.start();
        t2.start();

        //哪一個執行緒執行到這個方法，此時取得的就是哪一個執行緒的對象
        /*Thread thread = Thread.currentThread();
        String t = thread.getName();
        System.out.println(t);*/

        /*System.out.println("1111111");
        Thread.sleep(5000);
        System.out.println("2222222");*/
    }
}

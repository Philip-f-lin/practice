package com.example.mythread.a03threadcase3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*
         * 多執行緒的第三種實作方式：
         * 特點：可以取得到多執行緒運行的結果
         *
         * 1. 建立一個類別MyCallable實作Callable介面
         * 2. 重寫call （是有回傳值的，表示多執行緒運行的結果）
         *
         * 3. 建立MyCallable的物件（表示多執行緒要執行的任務）
         * 4. 建立FutureTask的物件（作用管理多執行緒運行的結果）
         * 5. 建立Thread類別的對象，並啟動（表示執行緒）
         * */

        //建立MyCallable的物件（表示多執行緒要執行的任務）
        MyCallable mc = new MyCallable();
        //建立FutureTask的物件（作用管理多執行緒運行的結果）
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //創建線程的對象
        Thread t = new Thread(ft);
        //啟動執行緒
        t.start();

        //獲取多線程運行的結果
        Integer result = ft.get();
        System.out.println(result);


    }
}

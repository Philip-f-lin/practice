package com.example.mythread.a01threadpool1;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
    /*
        public static ExecutorService newCachedThreadPool() 建立一個沒有上限的執行緒池
        public static ExecutorService newFixedThreadPool (int nThreads) 建立有上限的線程池
    */


        //1.取得線程池對象
        ExecutorService pool1 = Executors.newFixedThreadPool(3);
        //2.提交任務
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());

        //3.銷毀線程池
        //pool1.shutdown();


    }
}

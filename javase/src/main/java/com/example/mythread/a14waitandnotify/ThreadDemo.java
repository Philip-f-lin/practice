package com.example.mythread.a14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args) {

        /**
         * 利用阻塞隊列完成生產者和消費者（等待喚醒機制）的代碼
         * 細節：
         *      生產者和消費者必須使用同一個阻塞隊列
         */

        //1. 創建阻塞隊列對象
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        //2. 創建線程對象，並把阻塞隊列傳遞過去
        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        //3. 開啟線程
        c.start();
        f.start();
    }
}

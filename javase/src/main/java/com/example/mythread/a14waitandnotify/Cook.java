package com.example.mythread.a14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                queue.put("麵條");
                System.out.println("廚師放了一碗麵條");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

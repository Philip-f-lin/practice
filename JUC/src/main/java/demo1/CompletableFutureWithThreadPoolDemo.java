package demo1;

import java.util.concurrent.*;

public class CompletableFutureWithThreadPoolDemo {
    public static void main(String[] args) {
        /*
        1. 沒有傳入自訂執行緒池，都用預設執行緒池ForkJoinPool

        2. 傳入了一個自訂線程池，如果你執行第一個任務的時候，傳入了一個自訂執行緒池：
        調用 thenRun 方法執行第二個任務時，則第二個任務和第一個任務是共用同一個執行緒池。
        調用 thenRunAsync 執行第二個任務時，則第一個任務使用的是你自己傳入的執行緒池，第二個任務使用的是 ForkJoin 執行緒池*/
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        try {
            CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() -> {
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "\t" + "任務1");
                return "213";
            },threadPool).thenRunAsync(() -> {
                try {
                    TimeUnit.MILLISECONDS.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "\t" + "任務2");
            }).thenRun(() -> {
                try {
                    TimeUnit.MILLISECONDS.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "\t" + "任務3");
            }).thenRun(() -> {
                try {
                    TimeUnit.MILLISECONDS.sleep(30);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "\t" + "任務4");
            });

            System.out.println(completableFuture.get(2L, TimeUnit.SECONDS));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            threadPool.shutdown();
        }
    }
}

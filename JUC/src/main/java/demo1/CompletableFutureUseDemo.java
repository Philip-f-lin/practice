package demo1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class CompletableFutureUseDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + "--- come in");
            int result = ThreadLocalRandom.current().nextInt(10);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("一秒後輸出結果： " +result);
            return result;
        }).whenComplete((v,e) -> {
            if(e == null){
                System.out.println("計算完成，更新系統 UpdateValue： " + v);
            }
        }).exceptionally(e -> {
            e.printStackTrace();
            System.out.println("異常情況：" + e.getCause() + "\t" + e.getMessage());
            return null;
        });
        System.out.println(Thread.currentThread().getName() + "線程先去忙其他任務");

        // 主線程不要立刻結束，否則 CompletableFuture 默認使用的線程池會立刻關閉，讓主線程先睡 3 秒
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void future1() throws InterruptedException, ExecutionException {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + "--- come in");
            int result = ThreadLocalRandom.current().nextInt(10);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("一秒後輸出結果： " +result);
            return result;
        });

        System.out.println(Thread.currentThread().getName() + "線程先去忙其他任務");

        System.out.println(completableFuture.get());
    }
}

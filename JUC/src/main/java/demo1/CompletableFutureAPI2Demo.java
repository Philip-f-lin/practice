package demo1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CompletableFutureAPI2Demo {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        // handle
        // 計算結果存在依賴關係，這兩個線程串行化
        // 有異常也可以繼續下一步，根據帶的異常參數可以進一步處理
        CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("111");
            return 1;
        }, threadPool).handle((f,e) -> {
            int i = 1/0;
            System.out.println("222");
            return f + 2;
        }).handle((f,e) -> {
            System.out.println("333");
            return f + 3;
        }).whenComplete((v,e) -> {
            if(e == null){
                System.out.println("總和為： " + v);
            }
        }).exceptionally(e -> {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        });

        System.out.println(Thread.currentThread().getName() + " --- 主線程先去忙其他事");
        threadPool.shutdown();
    }

    private static void thenApply() {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        // thenApply
        // 計算結果存在依賴關係，這兩個線程串行化
        // 由於存在依賴關係（當前步驟錯，不走下一步），當前步驟有異常的話就停止
        CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("111");
            return 1;
        }, threadPool).thenApply(f -> {
            int i = 1/0;
            System.out.println("222");
            return f + 2;
        }).thenApply(f -> {
            System.out.println("333");
            return f + 3;
        }).whenComplete((v,e) -> {
            if(e == null){
                System.out.println("總和為： " + v);
            }
        }).exceptionally(e -> {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        });

        System.out.println(Thread.currentThread().getName() + " --- 主線程先去忙其他事");
        threadPool.shutdown();
    }
}

package demo1;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureAPI3Demo {
    public static void main(String[] args) {
        /*CompletableFuture.supplyAsync(() -> {
            return 1;
        }).thenApply(f -> {
            return f + 2;
        }).thenApply(f -> {
            return f + 3;
        }).thenAccept(s -> System.out.println(s));*/

        // thenRun
        // 任務A執行完執行B，且B不需要A的結果
        System.out.println(CompletableFuture.supplyAsync(() -> "resultA").thenRun(() -> {}).join());
        System.out.println("-------------");

        // thenAccept
        // 任務A執行完執行B，B需要A的結果，但是任務B無回傳值
        System.out.println(CompletableFuture.supplyAsync(() -> "resultA").thenAccept(s -> System.out.println(s)).join());
        System.out.println("-------------");

        // thenApply
        // 任務A執行完執行B，B需要A的結果，同時任務B有回傳值
        System.out.println(CompletableFuture.supplyAsync(() -> "resultA").thenApply(r -> r + "resultB").join());

    }
}

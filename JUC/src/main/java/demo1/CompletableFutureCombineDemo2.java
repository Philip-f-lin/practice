package demo1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureCombineDemo2 {
    public static void main(String[] args) {
        CompletableFuture<Integer> thenCombineResult = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + "\t" + "come in 1");
            return 10;
        }).thenCombine(CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + "\t" + "come in 2");
            return 20;
        }), (x, y) -> {
            System.out.println(Thread.currentThread().getName() + "\t" + "come in 3");
            return x + y;
        }).thenCombine(CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + "\t" + "come in 4");
            return 30;
        }), (a, b) -> {
            System.out.println(Thread.currentThread().getName() + "\t" + "come in 5");
            return a + b;
        });

        System.out.println(thenCombineResult.join());
    }
}

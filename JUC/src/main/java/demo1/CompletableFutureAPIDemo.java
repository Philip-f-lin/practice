package demo1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CompletableFutureAPIDemo {
    public static void main(String[] args)
    {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "abc";
        });

        //System.out.println(completableFuture.get());
        //completableFuture.get(2L, TimeUnit.SECONDS);
        //System.out.println(completableFuture.join());

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 立刻獲取結果不阻塞，
        // completableFuture 計算完，返回計算完成後結果 => abc
        // completableFuture 沒算完，返回設定的 valueIfAbsent => xxx
        //System.out.println(completableFuture.getNow("xxx"));

        // completableFuture 計算完顯示 false，使用 join 返回計算完成後結果 => abc
        // completableFuture 沒算完顯示 true，使用 join 返回括號值 => completeValue
        // 當調用CompletableFuture.get（）被阻塞的時候，complete方法就是結束阻塞get()，取得設置的 complete 裡面的值
        System.out.println(completableFuture.complete("completeValue"));
        System.out.println(completableFuture.join());
    }
}

package demo1;


import java.util.concurrent.*;

public class FutureThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 3 個任務，開啟多個異步線程處理，需花費多少時間  // 403ms
        ExecutorService pool = Executors.newFixedThreadPool(3);

        long startTime = System.currentTimeMillis();

        FutureTask<String> futureTask1 = new FutureTask<>(() -> {
            try { TimeUnit.MILLISECONDS.sleep(200); } catch (InterruptedException e) { throw new RuntimeException(e); }
            return "task1 over";
        });
        pool.submit(futureTask1);

        FutureTask<String> futureTask2 = new FutureTask<>(() -> {
            try { TimeUnit.MILLISECONDS.sleep(300); } catch (InterruptedException e) { throw new RuntimeException(e); }
            return "task2 over";
        });
        pool.submit(futureTask2);

        System.out.println(futureTask1.get());
        System.out.println(futureTask2.get());

        FutureTask<String> futureTask3 = new FutureTask<>(() -> {
            try { TimeUnit.MILLISECONDS.sleep(300); } catch (InterruptedException e) { throw new RuntimeException(e); }
            return "task3 over";
        });

        long endTime = System.currentTimeMillis();
        System.out.println("---costTime: " + (endTime - startTime) + "毫秒");

        System.out.println(Thread.currentThread().getName() + "\t ---end" );
        pool.shutdown();
    }

    private static void m1() {
        // 3 個任務，只有一個 main 線程處理，需花費多少時間 // 916ms
        long startTime = System.currentTimeMillis();

        try { TimeUnit.MILLISECONDS.sleep(200); } catch (InterruptedException e) { throw new RuntimeException(e); }
        try { TimeUnit.MILLISECONDS.sleep(300); } catch (InterruptedException e) { throw new RuntimeException(e); }
        try { TimeUnit.MILLISECONDS.sleep(400); } catch (InterruptedException e) { throw new RuntimeException(e); }

        long endTime = System.currentTimeMillis();
        System.out.println("---costTime: " + (endTime - startTime) + "毫秒");
        System.out.println(Thread.currentThread().getName() + "\t ---end" );
    }
}

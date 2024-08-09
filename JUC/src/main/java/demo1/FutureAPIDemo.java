package demo1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureAPIDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        /**
         *1 get容易導致堵塞，一般建議成在程式後面，一旦呼叫不見不散，非要等到結果才會離開，不管你是否計算完成，容易程式堵塞。
         *2 假如不願意等待，希望過時不候，可以自動離開
         */

        FutureTask<String> futureTask = new FutureTask<>(() -> {
            System.out.println(Thread.currentThread().getName() + "\t ----come in");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "task over";
        });
        Thread t1 = new Thread(futureTask, "t1");
        t1.start();

        System.out.println(Thread.currentThread().getName() + "\t ---忙其他任務");

        //System.out.println(futureTask.get()); // get容易導致堵塞
        //System.out.println(futureTask.get(3, TimeUnit.SECONDS)); // 假如不願意等待，希望過時不候，可以自動離開

        while(true){
            if(futureTask.isDone()){
                System.out.println(futureTask.get());
                break;
            }else {
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.println("處理中，請稍候");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


}

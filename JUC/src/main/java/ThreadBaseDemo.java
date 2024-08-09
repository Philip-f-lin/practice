public class ThreadBaseDemo {
    public static void main(String[] args) {
        new Thread(() -> {

        }, "t1").start();
    }
}

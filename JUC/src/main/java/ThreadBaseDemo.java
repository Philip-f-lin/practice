import java.util.function.Consumer;
import java.util.stream.Stream;

public class ThreadBaseDemo {
    public static void main(String[] args) {


        Consumer<String> consumer = (s) -> {
            System.out.println(s);
        };

        Stream.of("aaa", "bbb", "ccc", "ddd").forEach(consumer);
    }
}

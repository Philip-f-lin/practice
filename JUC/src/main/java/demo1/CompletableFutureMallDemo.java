package demo1;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureMallDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(10).setStudentName("Andy").setMajor("CS");

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            return "Hello";
        });
        //System.out.println(completableFuture.get());
        System.out.println(completableFuture.join());
    }
}

@Data
@Accessors(chain = true)
class Student{
    private Integer id;
    private String studentName;
    private String major;
}

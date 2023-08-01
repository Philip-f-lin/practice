package myreflect.myreflect5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class MyReflectDemo {
    public static void main(String[] args) throws IllegalAccessException, IOException {

        Student s = new Student("小A", 23, '女', 167.5, "睡觉");
        Teacher t = new Teacher("播妞", 10000);
        saveObject(s);
    }


    public static void saveObject(Object obj) throws IllegalAccessException, IOException {
        Class clazz = obj.getClass();

        Field[] fields = clazz.getDeclaredFields();

        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(obj);
            bw.write(name+"="+value);
            bw.newLine();
        }

        bw.close();

    }
}
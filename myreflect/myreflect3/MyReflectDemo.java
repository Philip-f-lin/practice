package myreflect.myreflect3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
       /*
       Class类中用于获取成员变量的方法
            Field[] getFields()：                返回所有公共成员变量对象的数组
            Field[] getDeclaredFields()：        返回所有成员变量对象的数组
            Field getField(String name)：        返回单个公共成员变量对象
            Field getDeclaredField(String name)：返回单个成员变量对象

       Field类中用于创建对象的方法
            void set(Object obj, Object value)：赋值
            Object get(Object obj)              获取值

        */

        Class clazz = Class.forName("myreflect.myreflect3.Student");
        /*Field[] fields1 = clazz.getFields();
        for (Field field : fields1){
            System.out.println(field);
        }

        Field[] fields2 = clazz.getDeclaredFields();
        for (Field field : fields2) {
            System.out.println(field);
        }*/

        Field name = clazz.getDeclaredField("name");
        System.out.println(name);

        int modifiers = name.getModifiers();
        System.out.println(modifiers);

        String n = name.getName();
        System.out.println(n);

        Class type = name.getType();
        System.out.println(type);

        Student s = new Student("張三", 23, "男");
        name.setAccessible(true);
        String value = (String) name.get(s);
        System.out.println(value);

        name.set(s, "李四");

        System.out.println(s);
    }
}

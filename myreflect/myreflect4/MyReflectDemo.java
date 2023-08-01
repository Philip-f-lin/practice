package myreflect.myreflect4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /*
       Class类中用于获取成员方法的方法
            Method[] getMethods()：返回所有公共成员方法对象的数组，包括继承的
            Method[] getDeclaredMethods()：返回所有成员方法对象的数组，不包括继承的
            Method getMethod(String name, Class<?>... parameterTypes) ：返回单个公共成员方法对象
            Method getDeclaredMethod(String name, Class<?>... parameterTypes)：返回单个成员方法对象


       Method类中用于创建对象的方法
            Object invoke(Object obj, Object... args)：运行方法
            参数一：用obj对象调用该方法
            参数二：调用方法的传递的参数（如果没有就不写）
            返回值：方法的返回值（如果没有就不写）

        获取方法的修饰符
        获取方法的名字
        获取方法的形参
        获取方法的返回值
        获取方法的抛出的异常

    */

        Class clazz = Class.forName("myreflect.myreflect4.Student");

        /*Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        /*Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        Method m = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(m);

        int modifiers = m.getModifiers();
        System.out.println(modifiers);

        String name = m.getName();
        System.out.println(name);

        Parameter[] parameters = m.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        Class[] exceptionTypes = m.getExceptionTypes();
        for (Class exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }

        Student s = new Student();
        m.setAccessible(true);
        String result = (String) m.invoke(s, "漢堡包");
        System.out.println(result);


    }
}

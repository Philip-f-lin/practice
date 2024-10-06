package com.example.mytreemap;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        // 依照學生年齡的升序排列，年齡一樣依照姓名的字母排列，同姓名年齡視為同一人

        //this：表示目前要新增的元素
        // 0：表示已經在紅黑樹中存在的元素

        //返回值：
        //負數：表示目前要加的元素是小的，存左邊
        //正數：表示目前要新增的元素是大的，存右邊
        //0：表示目前要新增的元素已經存在，捨棄

        int i = this.getAge() - o.getAge();
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}

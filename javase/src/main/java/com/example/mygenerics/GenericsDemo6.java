package com.example.mygenerics;

import java.util.ArrayList;

public class GenericsDemo6 {
    public static void main(String[] args) {
        /*
            定義一個方法，形參是一個集合，但是集合中的資料型態不確定
         */

        // 創建集合的對象
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        ArrayList<Student2> list4 = new ArrayList<>();

        // 調用 method 方法
        method(list1);
        method(list2);
        //method(list3);

        //method(list4);
    }

    /*
        此時，泛型裡面寫的是什麼類型，那就只能傳遞什麼類型的資料。
        弊端：
            利用泛型方法有一個小弊端，此時他可以接受任意的資料型別
            Ye Fu Zi Student

        希望：本方法雖然不確定型，但以後我希望只能傳遞Ye Fu z

        此時我們就可以使用泛型的通配符：
            ？也表示不確定的類型
            他可以進行類型的限定
            ？ extends E：表示可以傳遞E或E所有的子類別類型
            ？ super E：表示可以傳遞E或E所有的父類類型

        應用場景：
            1. 如果我們在定義類、方法、接口的時候，如果類型不確定，就可以定義泛型類、泛型方法、泛型接口
            2. 如果類型不確定，但是能知道以後只能傳遞某個繼承體系中的，就可以泛型通配符
        泛型通配符：
            關鍵點：可以限定類型的範圍
     */

    public static void method(ArrayList<? super Fu> list){

    }
}

class Ye{}
class Fu extends Ye{}
class Zi extends Fu{}

class Student2{}

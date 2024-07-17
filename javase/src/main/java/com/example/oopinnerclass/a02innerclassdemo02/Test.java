package com.example.oopinnerclass.a02innerclassdemo02;

public class Test {
    public static void main(String[] args) {

        /*
            取得成員內部類別物件的兩種方式：
            方式一：外部類別編寫方法，對外提供內部類別物件
            方式二：直接創建
            格式：外部類別名稱.內部類別名稱 物件名稱= 外部類別物件.內部類別物件；
            範例：Outer.Inner oi = new Outer().new Inner();
         */

        new Outer().getInstance();
        Outer outer = new Outer();
        System.out.println(outer.getInstance());
    }
}

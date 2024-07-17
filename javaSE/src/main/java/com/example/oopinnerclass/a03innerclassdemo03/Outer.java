package com.example.oopinnerclass.a03innerclassdemo03;

public class Outer {
    private int a = 10;

    class Inner{
        private int a = 20;

        public void show(){
            int a = 30;
            // Outer.this 取得了外部類別物件的位址值
            System.out.println(Outer.this.a); // 10
            System.out.println(this.a); // 20
            System.out.println(a); // 10
        }
    }
}

package com.example.oopinnerclass.a03innerclassdemo03;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}

package com.example.oopinnerclass.a02innerclassdemo02;

public class Outer {
    String name;

    private class Inner{

    }

    public Inner getInstance(){
        return new Inner();
    }


}

package com.example.oopinnerclass.a04innerclassdemo04;

public class Test {
    public static void main(String[] args) {
        /*
            需要大家理解匿名內部類別的格式，而不是硬記：
            new 類別名稱或介面名稱（）｛重寫方法；
            ｝
        */

        // 匿名內部類
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重寫了swim方法");
            }
        };

        new Animal() {
            @Override
            public void eat() {
                System.out.println("重寫了eat方法");
            }
        };


        /*Dog dog = new Dog();
        method(dog);*/

        method(new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃骨頭");
            }
        });
    }

    public static void method(Animal a){// Animal a = 子類物件
        a.eat();
    }
}

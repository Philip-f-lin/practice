package com.example.oopinnerclass.a01innerclassdemo01;

public class Test1 {
    public static void main(String[] args) {

        /*
            需求：寫一個Javabean類別描述汽車。
            屬性：汽車的品牌，車齡，顏色，引擎的品牌，使用年限。
            內部類別的存取特點：
            內部類別可以直接存取外部類別的成員，包括私有外部類別要存取內部類別的成員，必須建立物件
         */

        Car c = new Car();
        c.carName = "toyota";
        c.carAge = 5;
        c.carColor = "黑色";

        c.show();
    }
}

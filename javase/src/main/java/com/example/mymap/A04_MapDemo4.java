package com.example.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class A04_MapDemo4 {
    public static void main(String[] args) {
        // Map 集合的第三種遍歷方式

        //1. 創建 Map 集合對象
        Map<String, String > map = new HashMap<>();

        //2. 添加元素
        map.put("尹志平","小龍女");
        map.put("郭靖","穆念慈");
        map.put("歐陽克","黃蓉");

        //3. 利用 lambda 表達是進行遍歷
        //底層：
        //forEach 其實是利用第二種方式進行遍歷，依次得到每一個鍵和值
        //再調用 accept 方法
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "=" + value);
            }
        });

        System.out.println("====================");

        map.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}

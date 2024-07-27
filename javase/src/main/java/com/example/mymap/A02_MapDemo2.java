package com.example.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //Map 集合的第一種遍歷方式

        //1. 創建 Map 集合對象
        Map<String, String > map = new HashMap<>();

        //2.新增元素
        map.put("尹志平","小龍女");
        map.put("郭靖","穆念慈");
        map.put("歐陽克","黃蓉");

        //3.透過鍵找值
        //3.1取得所有的鍵，把這些鍵放到一個單列集合當中
        Set<String> keys = map.keySet();

        //3.2遍歷單列集合，得到每一個鍵
        /*for (String key : keys) {
            //System.out.println(key);
            //3.3 利用 map 集合中的鍵獲取對應的值 get
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }*/

        keys.forEach(s -> {
                String value = map.get(s);
                System.out.println(s + " = " + value);
        });

    }
}

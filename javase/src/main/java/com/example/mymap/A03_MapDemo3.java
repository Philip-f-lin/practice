package com.example.mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        // Map 集合的第二種遍歷方式

        //1. 創建 Map 集合對象
        Map<String, String > map = new HashMap<>();

        //2. 添加元素
        map.put("尹志平","小龍女");
        map.put("郭靖","穆念慈");
        map.put("歐陽克","黃蓉");

        //3.Map集合的第二種遍歷方式
        //透過鍵值對物件進行遍歷
        //3.1 透過一個方法取得所有的鍵值對物件，回傳一個Set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //3.2 遍歷entries這個集合，去得到裡面的每一個鍵值對物件
        for (Map.Entry<String, String> entry : entries) {
            //3.3 利用entry呼叫get方法取得鍵和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        entries.stream().forEach(s ->{
            String key = s.getKey();
            String value = s.getValue();
            System.out.println(key + "=" + value);
        });

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}

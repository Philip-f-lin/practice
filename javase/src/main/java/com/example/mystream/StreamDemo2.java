package com.example.mystream;

import java.util.HashMap;

public class StreamDemo2 {
    public static void main(String[] args) {
        /*雙列集合    無                    無法直接使用stream流*/
        HashMap<String,String> hm = new HashMap<>();
        hm.put("aaa", "123");
        hm.put("bbb", "222");
        hm.put("ccc", "333");
        hm.put("ddd", "444");

        hm.entrySet().stream().forEach(s -> System.out.println(s));

        hm.keySet().forEach(s -> System.out.println(s));
    }
}

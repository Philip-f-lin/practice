package com.example.mytreemap;

import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        /*
            需求：
            字串 "aababcabcdabcde"
            請統計字串中每個字元出現的次數，並依照以下格式輸出輸出結果：
            a (5) b (4) c (3) d (2) e (1)

            新的統計觀念：利用map集合進行統計
            如果題目中沒有要求對結果進行排序，預設使用HashMap
            如果題目中要求對結果進行排序，請使用TreeMap
            鍵：表示要統計的內容
            值：表示要統計的次數
        */

        // 1. 定義字符串
        String s = "aababcabcdabcde";
        // 2. 創建集合
        TreeMap<Character, Integer> tm = new TreeMap<>();
        // 3. 遍歷字串得到裡面的每一個字元
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 拿 c 到集合判斷是否存在
            // 存在，表示當前字元又出現了一次
            // 不存在，表示目前字元是第一次出現
            if (tm.containsKey(c)){
                // 存在
                // 先把已經出現的次數拿出來
                int count = tm.get(c);
                // 當前字元又增加了一次
                count++;
                // 把自增之後的結果再加到集合當中
                tm.put(c, count);
            }else{
                // 不存在
                tm.put(c, 1);
            }
        }
        // 4. 遍歷集合，並依照指定的格式進行拼接
        // a (5) b (4) c (3) d (2) e (1)
        tm.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));

        System.out.println(sb);
    }
}

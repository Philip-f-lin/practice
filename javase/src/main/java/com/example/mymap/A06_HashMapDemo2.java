package com.example.mymap;

import java.util.*;

public class A06_HashMapDemo2 {
    public static void main(String[] args) {
        /*
        某個班級有 80 為學生，需投票出去玩的地點
        班長提供四個景點，{"A", "B", "C", "D"}
        每個學生只能投票一個景點，請統計哪個景點人數最多
         */

        // 1. 需要先讓同學們投票
        // 定義一個數組，儲存四個景點
        String[] arr = {"A", "B", "C", "D"};
        // 利用隨機數模擬 80 個同學的投票，並把投票的結果儲存起來
        Random r = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        // 2. 如果要統計的東西比較多，不方便使用計數器思想
        // 我們可以定義 map 集合，利用集合進行統計
        HashMap<String, Integer> hm = new HashMap<>();
        for (String name : list) {
            // 判斷當前的景點在 map 集合當中是否存在
            if(hm.containsKey(name)) {
                // 存在
                // 獲取景點已經被投票的次數
                int count = hm.get(name);
                // 表示當前景點又被投了一次
                count++;
                // 把新的次數再次添加到集合當中
                hm.put(name, count);
            }else {
                // 不存在
                hm.put(name, 1);
            }
        }
        System.out.println(hm);

        // 3. 求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count > max){
                max = count;
            }
        }
        // 4. 判斷哪個景點的次數跟最大值一樣，如果一樣，打印出來
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max){
                System.out.println(entry.getKey());
            }
        }
    }
}

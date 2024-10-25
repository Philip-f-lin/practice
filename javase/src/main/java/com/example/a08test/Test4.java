package com.example.a08test;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        /*
        需求
        定義一個Map集合，鍵用表示省份名稱province，數值表示市city，但市會有多個。
        加入完畢後，遍歷結果格式如下：
                江蘇省 = 南京市，揚州市，蘇州市，無錫市，常州市
                湖北省 = 武漢市，孝感市，十堰市，宜昌市，鄂州市
                河北省 = 石家莊市，唐山市，邢台市，保定市，張家口市
        */
        // 1. 創建 map 集合
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        // 2. 創建單列集合儲存市
        ArrayList<String> city1 = new ArrayList<>();
        city1.add("南京市");
        city1.add("揚州市");
        city1.add("蘇州市");
        city1.add("無錫市");
        city1.add("常州市");

        ArrayList<String> city2 = new ArrayList<>();
        city2.add("武漢市");
        city2.add("孝感市");
        city2.add("十堰市");
        city2.add("宜昌市");
        city2.add("鄂州市");

        ArrayList<String> city3 = new ArrayList<>();
        city3.add("石家莊市");
        city3.add("唐山市");
        city3.add("邢台市");
        city3.add("保定市");
        city3.add("張家口市");

        // 3. 把省份和多個市添加到 map 集合
        hm.put("江蘇省", city1);
        hm.put("湖北省", city2);
        hm.put("河北省", city3);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            // entry 依次表示每一個鍵值對對象
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(", ", "", "");
            for (String city : value) {
                sj.add(city);
            }
            System.out.println(key + " = " + sj);
        }
    }
}

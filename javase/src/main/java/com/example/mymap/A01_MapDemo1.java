package com.example.mymap;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        /*V
        put(K key,V value)   新增元素
        V remove(Object key) 根據鍵則除鍵值對元素
        void clear()         移除所有的鍵值對元素
        boolean containsKey(Object key)      判斷集合是否包含指定的鍵
        boolean containsValue(Object value)  判斷集合是否包含指定的值
        boolean isEmpty()    判斷集合是否為空
        int size ()  集合的長度，也就是集合中鍵值對的個數
        */

        //1. 創建 map 集合對象
        Map<String, String> m = new HashMap<>();

        //2. 添加元素
        //put方法的細節：
        //新增/覆蓋

        //在加入資料的時候，如果鍵不存在，那麼直接把鍵值對物件加到map集合當中，方法返回null
        //在加入資料的時候，如果鍵是存在的，那麼會把原有的鍵值對物件覆蓋，會把被覆蓋的值進行回

        m.put("郭靖","黃蓉");
        m.put("韋小寶","沐劍屏");
        m.put("尹志平","小龍女");

        //String value = m.put("韋小寶","雙兒");
        //System.out.println(value);

        //刪除
        //String result = m.remove("郭靖"); //黃蓉
        //System.out.println(result);

        //清空
        //m.clear();

        //判斷是否包含
        //boolean key = m.containsKey("郭靖");
        //System.out.println(key); //true

        //boolean value = m.containsValue("小龍女");
        //System.out.println(value);

        boolean result = m.isEmpty();
        System.out.println(result);

        int size = m.size();
        System.out.println(size);

        //3. 打印集合
        System.out.println(m);
    }
}

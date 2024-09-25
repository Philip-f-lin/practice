package com.example.mygenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        // 沒有泛型的時候，集合如何存儲數據

        // 結論：
        // 如果我們沒有給集合指定類型，預設認為所有的資料類型都是Object類型
        // 此時可以往集合中新增任意的資料類型。
        // 不過帶來一個壞處：我們在取得資料的時候，無法使用他的特有行為。
        // 此時推出了泛型，可以在新增資料的時候就把型別進行統一。
        // 而且我們在取得數據的時候，也省的強轉了，非常的方便。

        // 1. 創建集合對象
        ArrayList<String> list = new ArrayList<>();

        // 2. 添加集合元素
        //list.add(123);
        list.add("abc");
        //list.add(new Student("Andy", 123));

        // 3. 遍歷集合獲取裡面每一個元素
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            // 多態的弊端是無法存取子類別的特有功能
            // obj.length();
            // str.length();
            System.out.println(str);
        }
    }
}

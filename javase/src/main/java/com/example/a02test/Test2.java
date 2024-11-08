package com.example.a02test;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        /*需求：
            定義一個方法找某一個資料夾中，是否有以avi結尾的電影。
            （暫時不需要考慮子資料夾)
         */

        File file = new File("/Users/linzhuofei/Desktop/aaa");
        boolean b = haveAVI(file);
        System.out.println(b);
    }

    /**
     * 作用：用來找某一個資料夾中，是否有以avi結尾的電影
     *
     * @param file 要找的文件夾
     * @return 尋找的結果 存在true 不存在false
     */
    public static boolean haveAVI(File file) {
        // 1. 進入aaa資料夾，而且要取得裡面所有的內容
        File[] files = file.listFiles();
        // 2. 遍歷數組取得裡面的每一個元素
        for (File f : files) {
            // f：依序表示 aaa 資料夾裡面每一個檔案或資料夾的路徑
            if (f.isFile() && f.getName().endsWith(".avi")) {
                return true;
            }
        }
        // 3. 如果循環結束之後還沒找到，直接回傳false
        return false;
    }
}

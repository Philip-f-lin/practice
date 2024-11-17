package com.example.a02test;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        /*
        刪除一個多級文件夾
        如果我們要刪除一個有內容的文件夾
        1. 先刪除文件夾裡面所有的內容
        2. 再刪除自己
         */

        File file = new File("/Users/linzhuofei/Desktop/aaa");
        delete(file);
    }

    public static void delete(File src){
        // 1. 先刪除文件夾裡面所有的內容
        // 進入 src
        File[] files = src.listFiles();
        // 遍歷
        for (File file : files) {
            // 判斷，如果是文件，刪除
            if (file.isFile()){
                file.delete();
            }else {
                // 判斷，如果是文件夾，遞歸
                delete(file);
            }
        }
        // 2. 刪除自己
        src.delete();
    }
}

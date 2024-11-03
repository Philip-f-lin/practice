package com.example.myfile;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        //public Filel] listFiles()  取得目前該路徑下所有內容

        // 1. 創建 File 對象
        File f = new File("/Users/linzhuofei/Desktop/test");
        // 2. 1istFiles萬法
        // 作用：取得 test 資料夾裡面的所有內容，把所有的內容放到陣列中返回
        File[] files = f.listFiles();
        for (File file : files) {
            // file 依序表示 test 資料夾裡面的每一個檔案或文件
            System.out.println(file);
        }


    }
}

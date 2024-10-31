package com.example.myfile;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        /*
        public long length ()               傳回檔案的大小（位元組(字節)數量）
        public String getAbsolutePath()     傳回檔案的絕對路徑
        public String getPath ( )           傳回定義檔時使用的路徑
        public String getName ()            傳回檔案的名稱，帶後綴
        public long lastModified ()         傳回檔案的最後修改時間（時間毫秒值）
        */

        // 1.傳回檔案的大小（位元組(字節)數量）
        // 細節1：這個方法只能取得檔案的大小，單位是位元組
        // 如果單位我們要是M，G，可以不斷的除以1024
        // 細節2：這個方法無法取得資料夾的大小
        // 如果我們要取得一個資料夾的大小，我們需要把這個資料夾裡面所有的檔案大小都累加在一
        File f1 = new File("/Users/linzhuofei/Desktop/test/a.txt");
        long length = f1.length();
        System.out.println(length);

        File f2 = new File("/Users/linzhuofei/Desktop/test/bbb");
        long length2 = f2.length();
        System.out.println(length2);

        System.out.println("-----------------------------------");

        // 2.getAbsolutePath 傳回檔案的絕對路徑
        File f3 = new File("/Users/linzhuofei/Desktop/test/a.txt");
        String path1 = f3.getAbsolutePath();
        System.out.println(path1);

        File f4 = new File("/practice/a.txt");
        String path2 = f4.getAbsolutePath();
        System.out.println(path2);

        System.out.println("-----------------------------------");

        // 3.getPath 傳回定義檔時使用的路徑
        File f5 = new File("/Users/linzhuofei/Desktop/test/a.txt");
        String path3 = f5.getPath();
        System.out.println(path3);

        File f6 = new File("/practice/a.txt");
        String path4 = f6.getPath();
        System.out.println(path4);

    }
}

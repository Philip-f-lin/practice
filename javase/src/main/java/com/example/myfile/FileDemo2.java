package com.example.myfile;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        /*
        public boolean isDirectory()    判斷此路徑名表示的File是否為資料夾
        public boolean isFile()         判斷此路徑名所表示的File是否為文件
        public boolean exists           判斷此路徑名表示的File是否存在
        */

        // 1.對一個檔案的路徑進行判斷
        File f1 = new File("/Users/linzhuofei/Desktop/test/a.txt");
        System.out.println(f1.isDirectory()); // false
        System.out.println(f1.isFile()); // true
        System.out.println(f1.exists()); // true
        System.out.println("-----------------------------------");

        // 2.對一個資料夾的路徑進行判斷
        File f2 = new File("/Users/linzhuofei/Desktop/test/bbb");
        System.out.println(f2.isDirectory()); // true
        System.out.println(f2.isFile()); // false
        System.out.println(f2.exists()); // true
        System.out.println("-----------------------------------");

        // 3.對一個不存在的路徑進行判斷
        File f3 = new File("/Users/linzhuofei/Desktop/test/c.txt");
        System.out.println(f3.isDirectory()); // false
        System.out.println(f3.isFile()); // false
        System.out.println(f3.exists()); // false
    }
}

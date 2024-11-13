package com.example.a02test;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        /*
        * 需求：
        * 找到電腦所有以 avi 結尾的電影。（須考慮子文件夾）
        */
        findAVI();
    }

    public static void findAVI(){
        // 獲取本地所有盤符
        File[] arr = File.listRoots();
        for (File f : arr) {
            findAVI(f);
        }
    }

    public static void findAVI(File src){
        // 1. 進入文件夾 src
        File[] files = src.listFiles();
        // 2. 遍歷數組，依次得到 src 裡面每一個文件或文件夾
        if(files != null){
            for (File file : files) {
                if(file.isFile()){
                    // 3. 判斷如果是文件，就可以執行題目的業務邏輯
                    String name = file.getName();
                    if(name.endsWith(".avi")){
                        System.out.println(file);
                    }
                }else {
                    // 4. 判斷如果是文件夾，就可以用遞歸
                    // 細節：再次掉用此方法時，參數一定要是 src 的次一級路徑
                    findAVI(file);
                }
            }
        }

    }
}

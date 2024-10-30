package com.example.myfile;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        /*
        public File(String pathname)                根據檔案路徑建立文件對象
        public File(String parent, String child)    根據父路徑名字串和子路徑名字串建立檔案對象
        public File(File parent, String child)      根據父路徑對應檔案物件和子路徑名字串建立檔案對象
        */

        // 1.根據字串表示的路徑，變成File對象
        String str = "/Users/linzhuofei/Desktop/a.txt";
        File f1 = new File(str);
        System.out.println(f1); // /Users/linzhuofei/Desktop/a.txt

        // 2.父級路徑：/Users/linzhuofei/Desktop
        // 子路徑：a.txt
        String parent = "/Users/linzhuofei/Desktop";
        String child = "a.txt";
        File f2 = new File(parent, child);
        System.out.println(f2); // /Users/linzhuofei/Desktop/a.txt

        File f3 = new File(parent + "//" + child);
        System.out.println(f3); // /Users/linzhuofei/Desktop/a.txt

        // 3.把一個File表示的路徑和string表示路徑進行拼接
        File parent2 = new File("/Users/linzhuofei/Desktop");
        String child2 = "a.txt";
        File f4 = new File(parent2, child2);
        System.out.println(f4); // /Users/linzhuofei/Desktop/a.txt
    }
}

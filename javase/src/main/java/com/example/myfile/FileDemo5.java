package com.example.myfile;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
      /*
        public boolean delete()             刪除檔案、空資料夾
        細節：
             如果刪除的是文件，則直接刪除，不走回收站。
             如果刪除的是空資料夾，則直接刪除，不走回收站
             如果刪除的是有內容的資料夾，則刪除失敗
      */


        //1.建立File對象
        File f1 = new File("/Users/linzhuofei/Desktop/aaa/ggg");
        //2.刪除
        boolean b = f1.delete();
        System.out.println(b);


    }
}

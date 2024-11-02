package com.example.myfile;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
      /*
        public boolean createNewFile()      建立一個新的空的文件
        public boolean mkdir()              建立單層資料夾
        public boolean mkdirs()             建立多層資料夾
        public boolean delete()             刪除檔案、空資料夾
      */


        //1.createNewFile 建立一個新的空的文件
        //細節1：如果目前路徑表示的檔案是不存在的，則建立成功，方法傳回true
        // 如果目前路徑表示的檔案是存在的，則建立失敗，方法傳回false
        //細節2：如果父級路徑是不存在的，那麼方法會有異常IOException
        //細節3：createNewFile方法建立的一定是文件，如果路徑中不包含後綴名，則建立一個沒有後綴的文件
        /*File f1 = new File("/Users/linzhuofei/Desktop/aaa/ddd");
        boolean b = f1.createNewFile();
        System.out.println(b);//true*/


        //2.mkdir make Directory，資料夾（目錄）
        //細節1：當路徑是唯一的，如果目前路徑已經存在，則建立失敗，回傳false
        //細節2：mkdir方法只能建立單級資料夾，無法建立多層資料夾。
        File f2 = new File("/Users/linzhuofei/Desktop/aaa/aaa/bbb/ccc");
        boolean b = f2.mkdir();
        System.out.println(b);

        //3.mkdirs 建立多層資料夾
        //細節：既可以建立單層的，又可以建立多層的資料夾
        /*File f3 = new File("/Users/linzhuofei/Desktop/aaa/ggg");
        boolean b = f3.mkdirs();
        System.out.println(b);//true*/

    }
}

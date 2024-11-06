package com.example.a02test;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        // 需求：在目前模組下的aaa資料夾中建立一個 a.txt 文件
        File file = new File("javase/aaa");
        // 2. 建立父級路徑
        // 如果 aaa 是存在的，那麼此時建立失敗的。
        // 如果 aaa 是不存在的，那麼此時創建成功的
        file.mkdirs();
        // 3. 拼接父級路徑和子級路徑
        File src = new File(file, "a.txt");
        boolean b = src.createNewFile();
        if (b){
            System.out.println("創建成功");
        }else {
            System.out.println("創建失敗");
        }
    }
}

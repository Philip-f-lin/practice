package com.example.tcp.a01tcpdemo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // TCP協議，接收數據

        // 1.創建 ServerSocket 物件
        ServerSocket ss = new ServerSocket(10000);

        // 2.監聽客戶端的連接
        Socket socket = ss.accept();

        // 3.從連接通道中獲取輸入流讀取數據
        InputStream is = socket.getInputStream();
        int b;
        while((b = is.read()) != -1){
            System.out.println((char)b);
        }

        // 4.釋放資源
        socket.close();
        ss.close();
    }
}

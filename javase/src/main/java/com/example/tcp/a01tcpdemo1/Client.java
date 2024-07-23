package com.example.tcp.a01tcpdemo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // TCP協議，發送數據

        // 1.創建 Socket 物件
        // 細節：在創建物件時，會連接服務端
        //      如果連接不上，代碼會報錯
        Socket socket = new Socket("127.0.0.1", 10000);

        // 2.可以從連接通道中獲取數據
        OutputStream os = socket.getOutputStream();
        // 寫出數據
        os.write("aaa".getBytes());

        // 3.釋放資源
        os.close();
        socket.close();
    }
}

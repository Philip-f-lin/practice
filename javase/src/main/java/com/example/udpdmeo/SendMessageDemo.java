package com.example.udpdmeo;

import java.io.IOException;
import java.net.*;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        // 發送數據
        // 1.建立DatagramSocket物件（快遞公司）
        //細節：
        //綁定端口，以後我們就是透過這個端口往外發送
        //空參：所有可用的連接埠中隨機一個進行使用
        //有參：指定連接埠號碼進行綁定

        DatagramSocket ds = new DatagramSocket();

        // 2.打包數據
        String str = "你好呀";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        // 3.發送數據
        ds.send(dp);

        // 4.釋放資源
        ds.close();
    }
}

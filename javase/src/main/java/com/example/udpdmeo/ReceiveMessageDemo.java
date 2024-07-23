package com.example.udpdmeo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        //接收數據

        //1.建立DatagramSocket物件（快遞公司）
        //細節：
        //在接收的時候，一定要綁定連接埠
        //而且綁定的連接埠一定要跟發送的連接埠保持一致

        DatagramSocket ds = new DatagramSocket(10086);

        //2.接收數據
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //該方法是阻塞的
        //程式執行到這一步的時候，會在這裡等
        //等發送端發送消息過來
        System.out.println("1111");
        ds.receive(dp);
        System.out.println("2222");

        //3.解析數據
        byte[] data = dp.getData();
        int length = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        System.out.println("接收到數據" + new String(data, 0, length));
        System.out.println("該數據是從" + address + "這台電腦中的" + port + "這個連接埠發出的");

        //4.釋放資源
        ds.close();
    }
}

package com.example.inteAddressdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        // 1. 獲取 InetAddress 對象
        InetAddress address = InetAddress.getByName("MacBook-Air-3.local");
        System.out.println(address);

        String hostName = address.getHostName();
        System.out.println(hostName); // MacBook-Air-3.local

        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress); // 127.0.0.1

    }
}

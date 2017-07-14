package com.shrbank.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by lilei on 2017/7/14.
 * 使用net.Socket类的getInetAddress()方法来连接到指定主机
 */
public class WebPing {
    public static void main(String[] args) {
        try {
            InetAddress address;
            Socket socket = new Socket("lilei1995.com",80);
            address = socket.getInetAddress();
            System.out.println("连接到 " + address);
            socket.close();
        } catch (IOException e) {
            System.out.println("无法连接 " + args[0]);
            System.out.println(e);
        }
    }
}

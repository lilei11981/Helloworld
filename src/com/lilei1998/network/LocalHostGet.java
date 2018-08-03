package com.lilei1998.network;

import java.net.InetAddress;

/**
 * Created by lilei on 2017/7/14.
 * 使用InetAddress类的getLocalHost()方法获取本机ip地址和主机名
 */
public class LocalHostGet {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("Local HostAddress: " + address.getHostAddress());
        System.out.println("Local hostname: " + address.getHostName());
    }
}

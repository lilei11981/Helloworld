package com.company.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by lilei on 2017/7/11.
 * 使用InetAddress类的InetAddress.getByName()方法来获取指定主机的IP地址
 */
public class GetIP {
    public static void main(String[] args) {
        InetAddress address = null;    // 实例化对象
        try {
            address = InetAddress.getByName("company.com");  // 获取指定主机的IP地址
        } catch (UnknownHostException e) {
            System.exit(1);
        }
        System.out.println(address.getHostName() + " = " + address.getHostAddress());  // 打印输出主机地址
        System.exit(0);
    }
}

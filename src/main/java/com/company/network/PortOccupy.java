package com.company.network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by lilei on 2017/7/14.
 * 检测端口是否已经使用
 */
public class PortOccupy {
    public static void main(String[] args) {
        String host = "localhost";
        if (args.length > 0) {
            host = args[0];
        }

        for (int i = 35700; i < 35750; i++) {
            try {
                System.out.println("查看 " + i);
                new Socket(host, i);
                System.out.println("端口 " + i + " 已被使用");
            } catch (UnknownHostException e) {
                System.out.println("Exception occurred" + e);
                break;
            } catch (IOException e) {

            }
        }
    }
}

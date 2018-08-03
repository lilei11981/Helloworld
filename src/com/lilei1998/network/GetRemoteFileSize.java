package com.lilei1998.network;

import java.net.URL;
import java.net.URLConnection;

/**
 * Created by lilei on 2017/7/14.
 * 获取远程文件大小
 */
public class GetRemoteFileSize {
    public static void main(String[] args) throws Exception {
        int size;
        URL url = new URL("http://lilei1998.com/Map_of_Westeros.jpg");
        URLConnection connection = url.openConnection();
        size = connection.getContentLength();
        if (size < 0) {
            System.out.println("无法获取文件大小！");
        } else {
            System.out.println("文件大小为： " + size + " bytes");
        }

//        connection.getInputStream().close();
    }
}

package com.shrbank.network;

import java.io.IOException;
import java.net.URL;

/**
 * Created by lilei on 2017/7/7.
 * Java URL处理
 * URL可以分为如以下几个部分
 * protocol://host:port/port/path?query#fragment
 * protocol(协议）可以是http、https、ftp和File
 * port为 端口号
 * path为 文件路径及文件名
 *
 * 使用java.net包的URL类获取URL的各个部分参数
 */
public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.runoob.com/index.html?language=cn#j2se");  // 实例化URL
            System.out.println("URL 为：" + url.toString());   // 输出URL字符串
            System.out.println("协议为：" + url.getProtocol());   // 返回协议 http
            System.out.println("验证信息为：" + url.getAuthority());  // 返回URL的授权部分 www.runoob.com
            System.out.println("文件名及请求参数：" + url.getFile());  // 返回文件名部分  /index.html?language=cn
            System.out.println("主机名：" + url.getHost());    // 返回主机名
            System.out.println("路径：" + url.getPath());
            System.out.println("端口：" + url.getPort());
            System.out.println("默认端口：" + url.getDefaultPort());
            System.out.println("请求参数：" + url.getQuery());
            System.out.println("定位位置：" + url.getRef());  // 获取URL的锚点，也称引用
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

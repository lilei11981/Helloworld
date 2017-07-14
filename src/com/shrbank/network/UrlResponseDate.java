package com.shrbank.network;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

/**
 * Created by lilei on 2017/7/14.
 * 使用HttpURLConnection类的httpCon.getDate()方法来获取URL响应头的日期信息
 */
public class UrlResponseDate {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://lilei1998.com");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        long date = httpURLConnection.getDate();
        if (date == 0) {
            System.out.println("无法获取信息！");
        } else {
            System.out.println("Date: " +  new Date(date));
        }
    }
}

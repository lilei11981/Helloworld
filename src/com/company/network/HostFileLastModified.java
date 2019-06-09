package com.company.network;

import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;

/**
 * Created by lilei on 2017/7/14.
 * 查看主机文件最后修改时间
 */

public class HostFileLastModified {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://company.com/Character_Tree.jpg");
        URLConnection urlConnection = url.openConnection();
        urlConnection.setUseCaches(false);
        long timestamp = urlConnection.getLastModified();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println("文件最后修改时间：" + sdf.format(timestamp));
    }
}

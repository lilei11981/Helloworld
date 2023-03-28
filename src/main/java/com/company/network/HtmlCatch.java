package com.company.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by lilei on 2017/7/14.
 * 使用net.URL类的URL()构造函数来抓取网页
 */
public class HtmlCatch {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.baidu.com");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter writer = new BufferedWriter(new FileWriter("index.html"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }
}

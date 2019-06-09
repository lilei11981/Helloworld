package com.company.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

//import java.net.MalformedURLException;

/**
 * Created by lilei on 2017/7/7.
 * openConnection()返回一个java.net.URLConnection
 * getInputStream() 方法用于返回的一个代表实体内容的输入流对象
 * InputStreamReader ： 是字节流与字符流之间的桥梁，能将字节流输出为字符流，并且能为字节流指定字符集，可输出一个个的字符；
 * BufferedReader ： 提供通用的缓冲方式文本读取，readLine读取一个文本行， 从字符输入流中读取文本，缓冲各个字符，从而提供字符、数组和行的高效读取。
 */
public class URLConnectionDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.company.com");  // 实例化URL
            URLConnection urlConnection = url.openConnection();   // 实例化URLConnection对象，返回HttpURLConnection对象
            HttpURLConnection connection = null;                  // 实例化HttpURLConnection对象
            if (urlConnection instanceof HttpURLConnection) {     // 判定urlConnection是否为HttpURLConnection的一个实例
                connection = (HttpURLConnection) urlConnection;   // 如果判断为true，则将urlConnection转换为HttpURLConnection对象
            } else {
                System.out.println("请输入URL地址：");     // 如果判断为false，则输出"请输入URL地址："并返回
                return;
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));  // 实例化BufferedReader对象
            String urlString = "";     // 声明字符串类型变量urlString并赋初值为空
            String current;           // 声明字符串类型变量current
            while ((current = in.readLine()) != null) {   // 读取文本内容，并赋值给current
                urlString += current;      // 将current的值赋值给urlString
            }
            System.out.println(urlString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.company.fileoperate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by lilei on 2017/7/7.
 * 使用write()方法向文件中追加数据
 */
public class FileAddInfo {
    public static void main(String[] args) throws Exception {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("fileName"));
            out.write("aString1\n");
            out.close();
            out = new BufferedWriter(new FileWriter("fileName", true));
            out.write("aString2\n");
            out.close();
            BufferedReader in = new BufferedReader(new FileReader("fileName"));

            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }
}

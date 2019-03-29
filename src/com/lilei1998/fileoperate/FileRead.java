package com.lilei1998.fileoperate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//import java.io.BufferedWriter;

/**
 * Created by lilei on 2017/7/5.
 * <p>
 * 使用readLine()方法来读取runoob.txt的内容
 */
public class FileRead {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("runoob.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        } catch (IOException e) {

        }
    }
}

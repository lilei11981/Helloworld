package com.shrbank.fileoperate;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Created by lilei on 2017/7/5.
 * BufferedWriter 实例化
 * FileWriter 写入文件
 * out.write() 写入
 * out.close() 关闭写入流
 *
 */
public class FileWrite {
    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("runoob.txt"));
            out.write("菜鸟教程");
            out.close();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

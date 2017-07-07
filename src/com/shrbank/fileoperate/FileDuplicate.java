package com.shrbank.fileoperate;

import java.io.*;

/**
 * Created by lilei on 2017/7/7.
 * 使用BufferedWriter类的read和write方法
 * 将文件内容复制到另一个文件
 */
public class FileDuplicate {
    public static void main(String[] args) throws Exception {
        BufferedWriter out1 = new BufferedWriter(new FileWriter("srcfile")); // 实例化BufferedWriter类，创建srcfile文件
        out1.write("String to be copied");    // 写入
        out1.close();  // 关闭写入流
        InputStream in = new FileInputStream(new File("srcfile"));    // 实例化文件输入流，创建输入文件路径
        OutputStream out = new FileOutputStream(new File("destnfile"));  // 实例化文件输出流，创建输出文件路径
        byte[] buf = new byte[1024];     // 创建buf数组，长度为1024位
        int len;              // 声明整型变量len
        while ((len = in.read(buf)) > 0) {    // 将读取的srcfile文件的位数复制给len
            out.write(buf, 0, len);     // 当位数大于0时，在destnfile文件中写入字符串
        }
        in.close();   //  关闭输入流
        out.close();   // 关闭输出流
        BufferedReader in1 = new BufferedReader(new FileReader("destnfile")); // 实例化BufferedWriter类，创建destnfile文件
        String str;          // 声明字符串str
        while ((str = in1.readLine()) != null) {  // 读取destnfile文件的值，并赋值给str，如果值不为空，则输出该值
            System.out.println(str);
        }
        in1.close();   // 关闭读取流
    }
}

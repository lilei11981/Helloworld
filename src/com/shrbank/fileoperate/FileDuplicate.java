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
        InputStream in = new FileInputStream(new File("srcfile"));
        OutputStream out = new FileOutputStream(new File("destnfile"));
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
        BufferedReader in1 = new BufferedReader(new FileReader("destnfile"));
        String str;
        while ((str = in1.readLine()) != null) {
            System.out.println(str);
        }
        in1.close();
    }
}

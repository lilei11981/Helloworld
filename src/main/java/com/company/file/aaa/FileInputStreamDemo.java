package com.company.file.aaa;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author lilei
 * @date 2021-08-01 下午3:39
 * @apiNote
 */

public class FileInputStreamDemo {

    public static void main(String[] args) {
        //统计文件字节长度
        int count = 0;
        //文件输入流
        InputStream streamReader = null;
        try {
            streamReader = new FileInputStream(new File("file/jack.txt"));
            // FileInputStream是有缓冲区的，所以用完之后必须关闭，否则可能导致内存占满，数据丢失。

            //读取文件字节，并递增指针到下一个字节
            while (streamReader.read() != -1) {
                count++;
            }
            System.out.println("长度是： " + count + " 字节");
        } catch (final IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (streamReader != null) {
                    streamReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

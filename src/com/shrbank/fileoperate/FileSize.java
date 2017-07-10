package com.shrbank.fileoperate;

import java.io.File;

/**
 * Created by lilei on 2017/7/10.
 * 使用File类的file.exists()类和file.length()方法来获取文件大小，以字节计算。
 */
public class FileSize {
    public static long getFileSize(String fileName) {
        File file = new File(fileName);
        if (!file.exists() || !file.isFile()) {
            System.out.println("文件不存在");
            return -1;
        }
        return file.length();
    }
    public static void main(String[] args) {
        long size = getFileSize("fileName");
        System.out.println("文件大小为：" + size);
    }
}

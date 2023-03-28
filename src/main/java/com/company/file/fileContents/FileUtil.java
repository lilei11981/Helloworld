package com.company.file.fileContents;

import java.io.File;
import java.io.IOException;

/**
 * Created by lilei on 2017/7/10.
 * 使用File类的file.getName()和file.listFiles()方法来打印目录结构
 */
public class FileUtil {
    public static void main(String[] args) throws IOException {
        showDir(1, new File("file"));
    }

    static void showDir(int indent, File file) throws IOException {
        for (int i = 0; i < indent; i++) {
            System.out.print('-');
        }
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File value : files) {
                showDir(indent + 4, value);
            }
        }
    }
}

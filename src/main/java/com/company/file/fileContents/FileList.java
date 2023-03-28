package com.company.file.fileContents;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by lilei on 2017/7/10.
 * 利用File类的list()方法来遍历指定目录下的所有目录
 */
public class FileList {
    public static void main(String[] args) {
        // 实例化File对象
        File dir = new File(".");
        // 声明一个数组变量files，返回抽象路径名的定义中表示此抽象路径名的目录中的文件的数组
        File[] files = dir.listFiles();
        // 实例化FileFilter对象
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory();
            }
        };
        files = dir.listFiles(fileFilter);
        System.out.println(files.length);
        if (files.length == 0) {
            System.out.println("目录不存在或它不是一个目录");
        } else {
            for (File fileName : files) {
                System.out.println(fileName.toString());
            }
        }
    }
}

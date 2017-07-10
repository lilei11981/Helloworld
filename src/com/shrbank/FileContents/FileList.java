package com.shrbank.FileContents;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by lilei on 2017/7/10.
 * 利用File类的list()方法来遍历指定目录下的所有目录
 */
public class FileList {
    public static void main(String[] args) {
        File dir = new File("/Users/lilei/IdeaProjects/HelloWorld");
        File[] files = dir.listFiles();
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
            for (int i = 0; i < files.length; i++) {
                File fileName = files[i];
                System.out.println(fileName.toString());
            }
        }
    }
}

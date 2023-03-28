package com.company.file.fileContents;

import java.io.File;

/**
 * Created by lilei on 2017/7/10.
 * 在指定目录查找文件
 */
public class FileSearch {
    public static void main(String[] args) {
        File dir = new File("file");
        String[] children = dir.list();
        if (children == null) {
            System.out.println("该目录不存在");
        } else {
            for (String fileName : children) {
                System.out.println(fileName);
            }
        }
    }
}

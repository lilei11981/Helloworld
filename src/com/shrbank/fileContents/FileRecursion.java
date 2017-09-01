package com.shrbank.fileContents;

import java.io.File;

/**
 * Created by lilei on 2017/7/10.
 * 使用File类的mkdirs()实现递归创建目录
 */

public class FileRecursion {
    public static void main(String[] args) {
        String directories = "/Users/lilei/IdeaProjects/HelloWorld\\a\\b\\c\\d";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
    }
}

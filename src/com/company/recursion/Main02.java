package com.company.recursion;

import java.io.File;

/**
 * @author lilei
 * @date 2020-07-04 17:33
 * @apiNote
 */

public class Main02 {

    private static int i = 0;
    private static int j = 0;

    public static void main(String[] args) {
        File file = new File("/Users/lilei/IdeaProjects/HelloWorld");
        getAllFiles(file);
    }

    private static void getAllFiles(File file) {

//        System.out.println("第" + ++i + "个目录：" + file);
        File[] listFiles = file.listFiles();
        for (File listFile : listFiles) {
            if (listFile.isDirectory()) {
                getAllFiles(listFile);
            } else {
                if (listFile.getPath().endsWith(".java")) {
                    System.out.println("第" + ++j + "个java文件：" + listFile);
                }
            }
        }
    }
}

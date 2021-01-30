package com.company.algorithm.recursion;

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
        File file = new File("/Users/lilei/IdeaProjects/HelloWorld/src");
        getAllFiles(file);
    }

    private static void getAllFiles(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
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

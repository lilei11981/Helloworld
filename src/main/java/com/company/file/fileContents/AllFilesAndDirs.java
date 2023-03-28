package com.company.file.fileContents;

import java.io.File;

/**
 * Created by lilei on 2017/9/4 下午5:25.
 * 遍历目录
 */
public class AllFilesAndDirs {
    public static void main(String[] args) {
        System.out.println("遍历目录：");
        File dir = new File("file");
        visitAllFilesAndFiles(dir);
    }

    public static void visitAllFilesAndFiles(File dir) {
        System.out.println(dir);
        if (dir.isDirectory()) {
            String[] children = dir.list();
            if (children != null) {
                for (String child : children) {
                    visitAllFilesAndFiles(new File(dir, child));
                }
            }
        }
    }
}

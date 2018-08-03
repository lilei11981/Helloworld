package com.lilei1998.fileContents;

import java.io.File;

/**
 * Created by lilei on 2017/9/4 下午5:25.
 * 遍历目录
 */
public class AllFilesAndDirs {
    public static void main(String[] args) {
        System.out.println("遍历目录：");
        File dir = new File("/Users/lilei/IdeaProjects/HelloWorld/src/com/lilei1998/fileContents");
        visitAllFilesAndFiles(dir);
    }

    public static void visitAllFilesAndFiles(File dir) {
        System.out.println(dir);
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                visitAllFilesAndFiles(new File(dir, children[i]));
            }
        }
    }
}

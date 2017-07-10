package com.shrbank.FileContents;

import java.io.File;

/**
 * Created by lilei on 2017/7/10.
 * 在指定目录查找文件
 */
public class FileSearch {
    public static void main(String[] args) {
        File dir = new File("/Users/lilei/IdeaProjects/HelloWorld");
        String[] children = dir.list();
        if (children == null) {
            System.out.println("该目录不存在");
        } else {
            for (int i = 0; i < children.length; i++) {
                String fileName = children[i];
                System.out.println(fileName);
            }
        }
    }
}

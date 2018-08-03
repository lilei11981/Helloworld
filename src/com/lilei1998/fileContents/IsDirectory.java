package com.lilei1998.fileContents;

import java.io.File;

/**
 * Created by lilei on 2017/7/10.
 * 判断文件夹是否为空
 */
public class IsDirectory {
    public static void main(String[] args) {
        File file = new File("/Users/lilei/IdeaProjects/HelloWorld");
        if (file.isDirectory()) {
            String[] files = file.list();
            if (files.length > 0) {
                System.out.println("目录 " + file.getPath() + " 不为空！");
            }
        }
    }
}

package com.lilei1998.fileContents;

import java.io.File;

/**
 * Created by lilei on 2017/7/10.
 * 输出指定目录下的所有文件
 */
public class AllFileList {
    public static void main(String[] args) {
        File dir = new File("/Users/lilei/IdeaProjects/HelloWorld");
        String[] children = dir.list();
        if (children == null) {
            System.out.println("目录不存在或它不是一个目录");
        } else {
            for (int i = 0; i < children.length; i++) {
                String fileName = children[i];
                System.out.println(fileName);
            }
        }
    }
}

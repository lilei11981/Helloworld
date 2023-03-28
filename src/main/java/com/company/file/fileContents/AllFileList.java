package com.company.file.fileContents;

import java.io.File;

/**
 * 输出指定目录下的所有文件
 * Created by lilei on 2017/7/10.
 */

public class AllFileList {
    public static void main(String[] args) {
        File dir = new File("file");
        String[] children = dir.list();
        if (children == null) {
            System.out.println("目录不存在或它不是一个目录");
        } else {
            for (String filename : children) {
                System.out.println(filename);
            }
        }
    }
}

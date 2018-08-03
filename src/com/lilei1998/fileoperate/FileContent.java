package com.lilei1998.fileoperate;

import java.io.File;

/**
 * Created by lilei on 2017/7/10.
 */
public class FileContent {
    public static void main(String[] args) throws Exception {
        File file = null;
        File dir = new File("/Users/lilei/ideaprojects/helloworld");
        file = File.createTempFile("JavaTemp", ".javatemp", dir);
        System.out.println(file.getPath());
    }
}

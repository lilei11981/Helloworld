package com.company.file.fileoperate;

import java.io.File;

/**
 * Created by lilei on 2017/7/10.
 */
public class FileContent {
    public static void main(String[] args) throws Exception {
        File dir = new File("file");
        File file = File.createTempFile("123", ".txt", dir);
        System.out.println(file.getPath());
    }
}

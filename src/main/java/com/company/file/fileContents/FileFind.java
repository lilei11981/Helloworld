package com.company.file.fileContents;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by lilei on 2017/7/10.
 */
public class FileFind {
    public static void main(String[] args) {
        File dir = new File("file");
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("g");
            }
        };
        String[] children = dir.list(filter);
        if (children == null) {
            System.out.println("目录不存在或它不是一个目录");
        } else {
            for (String fileName : children) {
                System.out.println(fileName);
            }
        }
    }
}

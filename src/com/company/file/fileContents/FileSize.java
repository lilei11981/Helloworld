package com.company.file.fileContents;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * Created by lilei on 2017/9/4 下午4:30.
 */
public class FileSize {
    public static void main(String[] args) {
        long size = FileUtils.sizeOfDirectory(new File("/Users/lilei/IdeaProjects/HelloWorld"));
        System.out.println("Size: " + size + " bytes");
    }
}

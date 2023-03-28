package com.company.file.fileContents;

import java.io.File;

/**
 * Created by lilei on 2017/9/4 下午4:21.
 */
public class FileHidden {
    public static void main(String[] args) {
        File file = new File("file");
        System.out.println(file.isHidden());
    }
}

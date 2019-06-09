package com.company.fileoperate;

import java.io.File;

/**
 * Created by lilei on 2017/7/10.
 */
public class FileReadOnly {
    public static void main(String[] args) {
        File file = new File("java.txt");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }
}

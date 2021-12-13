package com.company.file.fileoperate;

import java.io.File;

/**
 * Created by lilei on 2017/9/4 下午3:20.
 */
public class FileExists {
    public static void main(String[] args) {
        File file = new File("./file/jack.txt");
        System.out.println(file.exists());
    }
}

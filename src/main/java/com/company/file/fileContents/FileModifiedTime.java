package com.company.file.fileContents;

import java.io.File;
import java.util.Date;

/**
 * Created by lilei on 2017/7/10.
 */
public class FileModifiedTime {
    public static void main(String[] args) {
        File file = new File("file/jack.txt");
        System.out.println("最后修改时间：" + new Date(file.lastModified()));
    }
}

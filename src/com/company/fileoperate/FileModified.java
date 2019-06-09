package com.company.fileoperate;

import java.io.File;
import java.util.Date;

/**
 * Created by lilei on 2017/9/4 下午3:26.
 */
public class FileModified {
    public static void main(String[] args) {
        File file = new File("index.html");
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }
}

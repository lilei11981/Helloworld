package com.company.file.fileoperate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * @author lilei
 * @date 2021-05-23 下午11:03
 * @apiNote
 */

public class FileDemo {

    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream(new File("./file/jack.txt"));
        FileOutputStream fos = new FileOutputStream("./file/new.txt");
        byte[] bytes = new byte[1024];
        // int len;
        // while ((len = is.read(bytes)) > 0) {
        //     fos.write(bytes, 0, len);
        // }
        while (is.read(bytes) > 0) {
            fos.write(bytes);
        }
    }
}

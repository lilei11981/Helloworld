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
        InputStream is = new FileInputStream(new File("./file/test1.txt"));
        FileOutputStream fos = new FileOutputStream("./file/test2.txt");
        byte[] bytes = new byte[1024];

        int len;              // 声明整型变量len
        while ((len = is.read(bytes)) > 0) {    // 将读取的srcfile文件的位数复制给len
            fos.write(bytes, 0, len);     // 当位数大于0时，在destnfile文件中写入字符串
        }
        // while (is.read(bytes) > 0) {
        //     fos.write(bytes);
        // }

    }
}

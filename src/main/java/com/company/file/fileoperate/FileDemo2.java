package com.company.file.fileoperate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lilei
 * @date 2021-05-28 下午4:25
 * @apiNote
 */

public class FileDemo2 {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1000000; i++) {
            InputStream is = new FileInputStream(new File("./file/data.txt"));
            OutputStream os = new FileOutputStream("./file/data01.txt", true);
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) > 0) {
                os.write(bytes, 0, len);
            }
            os.close();
            is.close();
        }
    }
}

package com.company.file.fileoperate;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author lilei
 * @date 2021-05-23 下午11:03
 * @apiNote
 */

public class FileDemo {

    public static void main(String[] args) throws Exception {
        long s = System.currentTimeMillis();

        String infile = "/Users/lilei/Downloads/加密面试突击班/面试突击班一期/19mysql面试题01.vep";
        String outfile = "/Users/lilei/Downloads/bak";
        FileInputStream fis = new FileInputStream(infile);
        FileOutputStream fos = new FileOutputStream(outfile);

        // InputStream is = new FileInputStream(new File("./file/test1.txt"));
        // FileOutputStream fos = new FileOutputStream("./file/test2.txt");

        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) > 0) {
            fos.write(bytes, 0, len);
        }

        // while (is.read(bytes) > 0) {
        //     fos.write(bytes);
        // }

        long e = System.currentTimeMillis();
        System.out.println(e - s); // 9306

    }
}

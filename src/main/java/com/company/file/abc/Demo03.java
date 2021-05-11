package com.company.file.abc;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author lilei
 * @date 2020-07-04 21:39
 * @apiNote
 */

public class Demo03 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("file/test.txt");
            FileWriter fileWriter = new FileWriter("file/test1.txt");
            int len = 0;

//            while ((len = fileReader.read()) != -1) {
//                System.out.print((char)len);
//            }

            char[] chars = new char[1024];
            while ((len = fileReader.read(chars)) != -1) {
//                System.out.println(new String(chars, 0, len));
                fileWriter.write(chars, 0, len);
//                fileWriter.flush();
            }
            fileWriter.close();

            fileReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.company.file.abc;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author lilei
 * @date 2021-08-01 下午3:43
 * @apiNote
 */

public class Demo05 {

    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(1);
    }
}

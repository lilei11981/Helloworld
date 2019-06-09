package com.company.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by user on 2018/2/2.
 */
public class ReadBytesStream {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("test.txt");
            byte[] input = new byte[100];
            fileInputStream.read(input);


            String inputString = new String(input, "GBK");
            System.out.println(inputString);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

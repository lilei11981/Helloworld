package com.company.utils.java.base.util.io;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lilei\\Desktop\\test.txt");
        System.out.println(file.delete());
        //        System.out.println("21,474,836,480 ");
        //        System.out.println(Integer.MAX_VALUE);
    }
}

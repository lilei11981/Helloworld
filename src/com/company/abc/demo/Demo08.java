package com.company.abc.demo;

import java.io.File;

/**
 * @author lilei
 * @date 2020-07-04 13:34
 * @apiNote
 */

public class Demo08 {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);
        String separator = File.separator;
        System.out.println(separator);
    }
}

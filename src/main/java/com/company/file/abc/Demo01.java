package com.company.file.abc;

import java.io.File;

/**
 * @author lilei
 * @date 2020-07-04 15:29
 * @apiNote
 */

public class Demo01 {
    public static void main(String[] args) {
        deletePath("a");

//        createPath("a/b/c/d/e/f/g");
    }

    private static void createPath(String path) {
        File file = new File(path);
        System.out.println(file.mkdirs());
    }

    private static void deletePath(String path) {
        File file = new File(path);
        System.out.println(file.delete());
        File[] listFiles = file.listFiles();
        assert listFiles != null;
        for (File listFile : listFiles) {
            System.out.println(listFile.getAbsolutePath());
            if (listFile.isFile()) {
                System.out.println(listFile.delete());
            } else {
                deletePath(listFile.getPath());
            }
        }

    }


}

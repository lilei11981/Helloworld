package com.lilei1998.fileoperate;

import java.io.File;

/**
 * Created by lilei on 2017/7/10.
 */
public class FileRename {
    public static void main(String[] args) {
        File oldName = new File("game.txt");
        File newName = new File("java.txt");
        if (oldName.renameTo(newName)) {
            System.out.println("已重命名");
        } else {
            System.out.println("Error");
        }
    }
}

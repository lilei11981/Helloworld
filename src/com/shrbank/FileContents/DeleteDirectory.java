package com.shrbank.FileContents;

import java.io.File;

/**
 * Created by lilei on 2017/7/10.
 */
public class DeleteDirectory {
    public static void main(String[] args) {
        // 删除当前目录下的test目录
        deleteDir(new File("./test"));
    }
    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        if (dir.delete()) {
            System.out.println("目录已被删除！");
            return true;
        } else {
            System.out.println("目标删除失败！");
            return false;
        }
    }
}

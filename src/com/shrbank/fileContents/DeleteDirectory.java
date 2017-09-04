package com.shrbank.fileContents;

import java.io.File;

/**
 * Created by lilei on 2017/7/10.
 * // 使用File类的isDrectory()、list()、deleteDir()方法在一个个删除文件后删除目录
 */
public class DeleteDirectory {
    public static void main(String[] args) {
        // 删除当前目录下的test目录
        deleteDir(new File("./test"));
    }
    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {    // 判断是否为文件夹
            String[] children = dir.list();   // 声明 String 类型数组变量，
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));  // 声明 boolean 类型变量，
                if (!success) {
                    return false;
                }
            }
        }
        if (dir.delete()) {   // 判断文件夹是否已被删除
            System.out.println("目录已被删除！");
            return true;
        } else {
            System.out.println("目标删除失败！");
            return false;
        }
    }
}

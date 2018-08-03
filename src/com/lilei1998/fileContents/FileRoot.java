package com.lilei1998.fileContents;

import java.io.File;

/**
 * Created by lilei on 2017/9/4 下午5:14.
 * 查看系统根目录
 */
public class FileRoot {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        System.out.println("系统所有根目录: ");
        for (int i = 0; i < roots.length; i++) {
            System.out.println(roots[i].toString());
        }
    }
}

package com.company.file.fileoperate;

import java.io.File;

/**
 * Created by lilei on 2017/7/5.
 */
public class FileDelete {
    public static void main(String[] args) {
        try {
            File file = new File("file/runoob.txt");
            if (file.delete()) {
                System.out.println(file.getName() + " 文件已被删除！");
            } else {
                System.out.println("文件删除失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

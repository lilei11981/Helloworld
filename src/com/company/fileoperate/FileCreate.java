package com.company.fileoperate;

import java.io.File;
import java.io.IOException;

/**
 * Created by lilei on 2017/9/4 下午3:39.
 */
public class FileCreate {
    public static void main(String[] args) {
        try {
            File file = new File("java.txt");
            if (file.createNewFile()) {
                System.out.println("文件创建成功！");
            } else {
                System.out.println("出错了，该文件已经存在。");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

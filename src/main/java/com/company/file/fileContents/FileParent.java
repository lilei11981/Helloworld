package com.company.file.fileContents;

import java.io.File;

/**
 * Created by lilei on 2017/7/10.
 */
public class FileParent {
    public static void main(String[] args) {
        File file = new File("file");
        String strParentDirectory = file.getParent();
        System.out.println("文件的上级目录为：" + strParentDirectory);
    }
}

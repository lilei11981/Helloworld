package com.shrbank.fileContents;

import java.io.File;

/**
 * Created by lilei on 2017/9/4 下午4:21.
 */
public class FileHidden {
    public static void main(String[] args) {
        File file = new File("/Users/lilei/IdeaProjects/HelloWorld/.idea/");
        System.out.println(file.isHidden());
    }
}

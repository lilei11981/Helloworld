package com.shrbank.fileoperate;

import java.io.File;
import java.util.Date;

/**
 * Created by lilei on 2017/7/10.
 */
public class FileToChange {
    public static void main(String[] args) throws Exception{
        File fileToChange = new File("game.txt");   // 创建文件
        fileToChange.createNewFile();                        // 创建文件
        Date fileTime = new Date(fileToChange.lastModified());   // 获取文件最后修改时间
        System.out.println(fileTime.toString());       // 打印时间
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));  // 获取当前毫秒数，并设置为修改时间
        fileTime = new Date(fileToChange.lastModified());     // 重新获取文件最后修改时间
        System.out.println(fileTime.toString());       // 打印时间
    }
}

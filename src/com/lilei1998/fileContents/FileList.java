package com.lilei1998.fileContents;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by lilei on 2017/7/10.
 * 利用File类的list()方法来遍历指定目录下的所有目录
 */
public class FileList {
    public static void main(String[] args) {
        File dir = new File("/Users/lilei/IdeaProjects/HelloWorld");   // 实例化File对象
        File[] files = dir.listFiles();    // 声明一个数组变量files，返回抽象路径名的定义中表示此抽象路径名的目录中的文件的数组
        FileFilter fileFilter = new FileFilter() {   // 实例化FileFilter对象
            @Override    // 重写函数
            public boolean accept(File file) {      //  声明accept()方法，返回值为boolean类型
                return file.isDirectory();
            }
        };
        files = dir.listFiles(fileFilter);    //  fileFilter数组值赋给files
        System.out.println(files.length);
        if (files.length == 0) {          //  判断files的长度
            System.out.println("目录不存在或它不是一个目录");
        } else {
            for (int i = 0; i < files.length; i++) {   // 若长度不为0，则依次输出
                File fileName = files[i];
                System.out.println(fileName.toString());
            }
        }
    }
}

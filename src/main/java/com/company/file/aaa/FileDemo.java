package com.company.file.aaa;

import java.io.File;

/**
 * @author lilei
 * @date 2021-08-01 下午3:22
 * @apiNote
 */

public class FileDemo {

    public static void main(String[] args) {
        createFile();
    }

    /**
     * 文件处理示例
     */
    public static void createFile() {
        File f = new File("file/new.txt");
        try {
            //当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
            if (f.createNewFile()) {
                System.out.println("文件创建成功！");
            } else {
                System.out.println("文件创建失败！");
            }
            //返回磁盘分区大小
            System.out.println("该分区大小" + f.getTotalSpace() / (1024 * 1024 * 1024) + "G");
            //  删除此抽象路径名表示的文件或目录
            if (f.delete()) {
                System.out.println("文件删除成功");
            } else {
                System.out.println("文件删除失败");
            }
            //  返回由此抽象路径名表示的文件或目录的名称。
            System.out.println("文件名  " + f.getName());
            // 返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。
            System.out.println("文件父目录字符串 " + f.getParent());

            File filePath = new File("file/abc/cde/efg/");
            //创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
            if (filePath.mkdirs()) {
                System.out.println("目录创建成功");
            } else {
                System.out.println("目录创建失败");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.shrbank.fileContents;

/**
 * Created by lilei on 2017/9/4 下午5:20.
 */
public class CurrentList {
    public static void main(String[] args) {
        String currentList = System.getProperty("user.dir");
        System.out.println("你当前的工作目录为：" + currentList);
    }
}

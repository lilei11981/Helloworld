package com.shrbank.string;

/**
 * Created by lilei on 2017/8/12 下午1:32.
 * 使用 split() 方法分割指定字符串
 */

public class StringSplit {
    public static void main(String[] args) {

        String string = "Jon Sansa Bran Arya";
        String[] temp;
        String delimeter = " ";    //  指定分隔符
        temp = string.split(delimeter);   //  分割字符串

        for (int i = 0; i < temp.length; i++) {   //  使用 for 循环输出
            System.out.println(temp[i]);
        }

        System.out.println("--------------------");

        for (String s : temp) {        // 使用 foreach 循环输出
            System.out.println(s);
        }
    }
}

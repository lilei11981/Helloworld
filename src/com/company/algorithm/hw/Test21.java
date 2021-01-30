package com.company.algorithm.hw;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-09
 * Time: 6:06 PM
 * Description:
 * 找出输出字符串里面所有大写字母，将其逆序输出
 * 【输入】abcHDLmnkKl
 * 【输出】
 * 原字符串：abcHDLmnkKl
 * 大写字母：HDLK
 * 最后结果：KLDH
 */

public class Test21 {
    public static void main(String[] args) {
        Test21 test = new Test21();
        Scanner input = new Scanner(System.in);
        String string = input.next();
        String result = test.stringReverse(string);
        System.out.println("最后结果：" + result);
    }

    public String stringReverse(String input) {
        System.out.println("原字符串：" + input);
        char[] chars = input.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                stringBuffer.append(chars[i]);
            }
        }
        System.out.println("大写字母：" + stringBuffer.toString());
        return stringBuffer.reverse().toString();
    }
}

package com.company.zoo.aaa.hw;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-09-07
 * Time: 上午10:57
 * Description:
 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
 * <p>
 * 输入描述：
 * 输入一个十六进制的数值字符串
 * <p>
 * 输出描述：
 * 输出该数值的10进制字符串
 * <p>
 * 输入例子：
 * 0xA
 * <p>
 * 输出例子：
 * 10
 */

public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            char[] chars = string.toCharArray();
            int num = 0;
            for (int i = 2; i < chars.length; i++) {
                int tmp = 0;
                if (chars[i] >= 'A') {
                    tmp = chars[i] - 'A' + 10;
                } else {
                    tmp = chars[i] - '0';
                }
                num += tmp * Math.pow(16, chars.length - i - 1);
            }
            System.out.println(num);
        }
        scanner.close();
    }

}

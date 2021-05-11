package com.company.algorithm.hw;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-16
 * Time: 3:26 PM
 * Description:
 * 输入一段字符串，字符串中包含空格、数字、符号和字母（包含大小写），
 * 要求完成函数使得输出给定字符串中最长字符串，输出的字符串可以包含数字和字符，
 * 不可以有空格和符号。若有相同长度的字符串，则输出第一个。
 * 例如：输入:hello huawei!，输出为:huawei
 */

public class Test25 {
    public static void main(String[] args) {
        Test25 test = new Test25();
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        System.out.println("原字符串：" + inputString);
        String resultString = test.outputString(inputString);
        System.out.println("最后结果：" + resultString);
    }

    public String outputString(String input) {
        String[] strings = input.split("\\s+");
        System.out.println("被空格隔开的子字符串数组：" + Arrays.toString(strings));
        String result = "";
        int maxLength = strings[0].length();
        for (int i = 0; i < strings.length; i++) {
            if (maxLength < strings[i].length()) {
                maxLength = strings[i].length();
            }
        }
        System.out.println("最长字符串长度：" + maxLength);
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() == maxLength) {
                result = strings[i];
                break;
            }
        }
        System.out.println("最长字符串：" + result);
        char[] chars = result.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetterOrDigit(chars[i])) {
                stringBuffer.append(chars[i]);
            }
        }
        return stringBuffer.toString();
    }
}
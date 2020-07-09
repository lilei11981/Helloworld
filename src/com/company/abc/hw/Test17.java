package com.company.abc.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-06
 * Time: 2:22 PM
 * Description:
 * 通过键盘输入一串小写字母(a~z)组成的字符串
 * 请编写一个字符串过滤程序
 * 若字符串中出现多个相同的字符
 * 将非首次出现的字符过滤掉
 * 比如字符串“abacacde”过滤结果为“abcde”。
 * 要求实现函数：
 * void stringFilter(String inputString, long length);
 * 【输入】
 * inputString  输入字符串
 * length  输入字符串长度
 * 【注意】只需要完成该函数功能算法，中间不需要有任何IO的输入输出
 * 示例
 * 输入：“deefd”        输出：“def”
 * 输入：“afafafaf”     输出：“af”
 * 输入：“pppppppp”     输出：“p”
 */

public class Test17 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
//        Scanner inputLength = new Scanner(System.in);
        String string = inputString.nextLine();
//        long length = inputLength.nextLong();
        long length = string.length();
        Test17 test = new Test17();
        test.stringFilter(string, length);
    }

    public void stringFilter(String inputString, long length) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(inputString.charAt(i) + "");
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String s : list) {
            stringBuffer.append(s);
        }
        System.out.println(stringBuffer.toString());
    }
}

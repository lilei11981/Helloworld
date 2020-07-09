package com.company.abc.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-06
 * Time: 4:37 PM
 * Description:
 * 通过键盘输入一串小写字母(a~z)组成的字符串。
 * 请编写一个字符串压缩程序，
 * 将字符串中连续出席的重复字母进行压缩，
 * 并输出压缩后的字符串。
 * 压缩规则：
 * 1、仅压缩连续重复出现的字符。比如字符串"abcbc"由于无连续重复字符，压缩后的字符串还是"abcbc"。
 * 2、压缩字段的格式为"字符重复的次数+字符"。例如：字符串"xxxyyyyyyz"压缩后就成为"3x6yz"。
 * 要求实现函数：
 * void stringZip(String inputString);
 * inputString：输入字符串
 * 注意：只需要完成该函数功能算法，中间不需要有任何IO的输入输出
 * 示例
 * 输入：“cccddecc”   输出：“3c2de2c”
 * 输入：“adef”     输出：“adef”
 * 输入：“pppppppp” 输出：“8p”
 */

public class Test18 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        String string = inputString.nextLine();
        Test18 test = new Test18();
        test.stringZip(string);
    }

    public void stringZip(String inputString) {
        long length = inputString.length();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(inputString.charAt(i) + "");
        }

        int[] count = new int[(int) length];
        for (int i = 0; i < length; i++) {
            count[i] = 1;
        }

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count[i]++;
                    list.remove(j);
                    j--;
                } else {
                    break;
                }
            }
            if (count[i] != 1) {
                stringBuffer.append(count[i]);
            }
            stringBuffer.append(list.get(i));
            System.out.println("count[" + i + "]" + count[i]);
        }
        System.out.println("最后的结果：" + stringBuffer.toString());
    }
}

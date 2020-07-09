package com.company.abc.hw;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-14
 * Time: 6:15 PM
 * Description:
 * 通过键盘输入任意一个字符串序列，字符串可能包含多个子串，子串以空格分割。
 * 请编写一个程序，自动分离出各个子串，并使用','将其分离，并且在最后也补充一个','，并将子串存储。
 * 要求实现函数：
 * 【输入】   inputString       输入字符串
 * 【输出】   newString         输出字符串，空间已经开劈好，与输入输入字符串等长；
 * 【注意】   只需要完成该函数功能算法，中间不需要有任何IO的输入输出
 * 示例：
 * 输入："abc def ghi       d"
 * 输出："abc,def,ghi,d"
 */

public class Test22 {
    public static void main(String[] args) {
        Test22 test = new Test22();
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String result = test.divideString(string);
        System.out.println(result);
    }

    public String divideString(String inputString) {
        String newInputString = inputString.trim();
        System.out.println("原字符串：" + newInputString);
        String newString = inputString.replaceAll("\\s+", ",");
        System.out.println("新字符串：" + newString);
        if (newString.charAt(newString.length() - 1) != ',') {
            newString += ',';
        }
        return newString;
    }
}

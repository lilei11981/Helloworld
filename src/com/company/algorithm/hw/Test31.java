package com.company.algorithm.hw;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-12-11
 * Time: 10:42 AM
 * Description:
 * 在给定字符串中查找所有特定子串并删除，如果没有找到相应子串，则不作任何操作。
 * 要求实现函数：
 * int getNumber(String originString, String subString)
 * 【输入】 originString：输入的被操作字符串 subString：需要查找并删除的特定子字符串
 * 【输出】 resultString：在originString字符串中删除所有subString子字符串后的结果
 * 【返回】 删除的子字符串的个数
 * 注：
 * I、 子串匹配只考虑最左匹配情况，即只需要从左到右进行字串匹配的情况。比如：
 * 在字符串"abababab"中，采用最左匹配子串"aba",可以匹配2个"aba"字串。如果
 * 匹配出从左到右位置2开始的"aba"，则不是最左匹配，且只能匹配出1个"aba"字串。
 * II、 输入字符串不会超过100 Bytes，请不用考虑超长字符串的情况。
 * 示例
 * 输入：originString = "abcde123abcd123"  subString = "123"
 * 输出：resultString = "abcdeabcd"
 * 返回：2
 * 输入：originString = "abcde123abcd123*****fdaklfa11123*123jfdlafl"  subString = "1234"
 * 输出：resultString = "abcde123abcd123*****fdaklfa11123*123jfdlafl"
 * 返回：0
 */

public class Test31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.next();
        String specialString = input.next();
        int result = getNumber(inputString, specialString);
        System.out.println("删除子串的个数：" + result);
    }

    public static int getNumber(String originString, String subString) {
        System.out.println("原字符串：" + originString);
        System.out.println("子串：" + subString);
        int count = 0;
        String resultString = "";
        while (originString.contains(subString)) {
            resultString = originString.substring(0, originString.indexOf(subString))
                    .concat(originString.substring(originString.indexOf(subString)
                            + subString.length()));
            count++;
            System.out.println("进入循环，count值：" + count);
        }
        System.out.println("输出的字符串：" + resultString);
        return count;
    }
}

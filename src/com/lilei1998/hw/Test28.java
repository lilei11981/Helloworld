package com.lilei1998.hw;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-27
 * Time: 11:04 AM
 * Description:
 * 问题描述：
 * 我国大陆运营商的手机号码标准格式为：国家码+手机号码，例如：8613912345678。
 * 特点如下：
 * 1、长度13位
 * 2、以86的国家码打头
 * 3、手机号码的每一位都是数字
 * 请实现手机号码合法性判断的函数
 * 注：考生无需关注手机号码的真实性，也就是说诸如86123123456789这样的手机号码，我们也认为是合法的。
 * 要求：
 * 1、如果手机号码合法，返回0
 * 2、如果手机号码长度不合法，返回1
 * 3、如果手机号码中包含非数字的字符，返回2
 * 4、如果手机号码不是以86打头的，返回3
 * 注：除成功的情况外，以上其他合法性判断的优先级依次降低。
 * 也就是说，如果判断出长度不合法，直接返回1即可，不需要再做其他合法性判断。
 * 要求实现函数：
 * int verifyPhoneNumber(String phoneNumber)
 * 【输入】 String phoneNumber 表示输入的手机号码字符串。
 * 【输出】  无
 * 【返回】  判断的结果，类型为int。
 * 示例
 * 输入：  phoneNumber = “869123456789“
 * 返回：  1
 * 输入：  phoneNumber = “8613goodStudy“
 * 返回：  2
 * 输入：  phoneNumber = “8813912345678“
 * 返回：  3
 * 输入：  phoneNumber = “8613912345678“
 * 返回：  0
 */

public class Test28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        Test28 test = new Test28();
        int output = test.verifyPhoneNumber(inputString);
        System.out.println("返回值：" + output);
    }

    public int verifyPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 13) {
            return 1;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (!Character.isDigit(phoneNumber.charAt(i))) {
                return 2;
            }
        }
        if (phoneNumber.charAt(0) != '8' || phoneNumber.charAt(1) != '6') {
            return 3;
        }
        return 0;
    }
}

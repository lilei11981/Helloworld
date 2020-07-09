package com.company.abc.hw;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-23
 * Time: 10:43 AM
 * Description:
 * 输入一串字符，拼音的1~9，输出相应数字，
 * 比如输入yiersansiwuliuqibajiu，输出123456789
 */

public class Test26 {
    public static void main(String[] args) {
        Test26 test = new Test26();
        String output = test.outputNumbers("yiersansiwuliuqibajiu");
        System.out.println("输出：" + output);
    }

    public String outputNumbers(String input) {
        String result = input.replace("yi", "1")
                .replace("er", "2")
                .replace("san", "3")
                .replace("si", "4")
                .replace("wu", "5")
                .replace("liu", "6")
                .replace("qi", "7")
                .replace("ba", "8")
                .replace("jiu", "9");
        System.out.println("输入：" + input);
        return result;
    }
}

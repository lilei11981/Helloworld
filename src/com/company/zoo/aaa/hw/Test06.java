package com.company.zoo.aaa.hw;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-09-11
 * Time: 上午10:41
 * Description:
 * 编写一个reverseAdd函数，实现两个数倒置后再求和的功能，比如输入123，456就是求321+654，输出975
 * <p>
 * 注意输入100,200输出3,（自动去除开头的0）,超过范围输出-1
 * <p>
 * 思路：
 * <p>
 * 输入数据带空格，先切割出整数，然后用StringBuilder翻转，转成数字自动去除0，求和，全程自带的函数.
 */

public class Test06 {
    public static void main(String[] args) {
        System.out.println("请输入两个整数，用,隔开：");
        Scanner scanner = new Scanner(System.in);
        String[] strings = null;
        if (scanner.hasNext()) {
            strings = scanner.nextLine().split(",");
        }

        if ((strings != null ? strings.length : 0) == 2) {
            String a = strings[0];
            String b = strings[1];
            System.out.println("反转后两数字相加结果：" + reverseAdd(a, b));
        }
    }

    public static int reverseAdd(String numA, String numB) {
        numA = numA.replace(" ", "");
        numB = numB.replace(" ", "");

        StringBuilder builderA = new StringBuilder(numA);
        StringBuilder builderB = new StringBuilder(numB);

        String stringA = builderA.reverse().toString();
        String stringB = builderB.reverse().toString();

        int intA = Integer.parseInt(stringA);
        int intB = Integer.parseInt(stringB);

        return intA + intB;
    }
}

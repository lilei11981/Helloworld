package com.company.zoo.aaa.hw;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-27
 * Time: 11:28 AM
 * Description:
 * 输入小于5000的整数，例如68，加上它反过来的数86,68+86=154，
 * 如果不是回文，则继续进行这种操作，154+451=605，605+506=1111是回文数。返回1111
 * 如果在7次这种操作内仍不能得出一个回文数，则返回0
 */

public class Test29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        if (inputNumber > 5000) {
            System.out.println("请输入小于5000的整数");
        } else {
            int outputNumber = getPalindrome(inputNumber);
            System.out.println("最终结果：" + outputNumber);
        }
    }

    public static boolean isPalindrome(int number) {  // 判断一个数字是不是回文数
        String numberString = String.valueOf(number);
        StringBuffer stringBuffer = new StringBuffer(numberString);
        String newString = stringBuffer.reverse().toString();
        return numberString.equals(newString);
    }

    public static int getReverse(int number) {  // 把一个数字反转
        String numberString = String.valueOf(number);
        StringBuffer stringBuffer = new StringBuffer(numberString);
        String newString = stringBuffer.reverse().toString();
        return Integer.parseInt(newString);
    }

    public static int getPalindrome(int number) {
        int sum = number + getReverse(number);
        int count = 1;
        while (!isPalindrome(sum) && count < 8) {
            sum += getReverse(sum);
            count++;
        }
        if (isPalindrome(sum)) {
            return sum;
        } else {
            return 0;
        }
    }
}

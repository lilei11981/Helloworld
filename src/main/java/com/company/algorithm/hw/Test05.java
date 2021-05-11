package com.company.algorithm.hw;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-09-09
 * Time: 上午8:22
 * Description:
 * 把两个七进制数相加，结果以七进制数表示
 */

public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            String b = scanner.next();
            int c = sevenToTen(a);
            int d = sevenToTen(b);
            int e = c + d;
            String f = tenToSeven(e);
            System.out.println(f);
        }
    }

    private static int sevenToTen(String sevenNumIn) {  // 把七进制数转为十进制数
        final int SEVEN = 7;
        int sevenNumOut = 0, sevenNumValue;
        char sevenNum;
        for (int i = 0; i < sevenNumIn.length(); i++) {
            sevenNum = sevenNumIn.charAt(sevenNumIn.length() - 1);
            sevenNumValue = sevenNum - '0';
            sevenNumOut += sevenNumValue * Math.pow(SEVEN, i);
        }
        return sevenNumOut;
    }

    private static String tenToSeven(int tenNumIn) {  // 把十进制数转为七进制数
        final int SEVEN = 7;
        boolean flag = false;
        if (tenNumIn < 0) {
            flag = true;
            tenNumIn = -tenNumIn;
        }

        StringBuilder tenNumOut = new StringBuilder();
        do {
            tenNumOut.append(tenNumIn % SEVEN);
            tenNumIn = tenNumIn / SEVEN;
        } while (tenNumIn > 0);

        return tenNumOut.reverse().toString();
    }
}

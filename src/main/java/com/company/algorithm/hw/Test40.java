package com.company.algorithm.hw;

import java.util.Scanner;

/**
 * @author lilei
 * @date 2020-07-16 13:04
 * @apiNote
 */

public class Test40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String a = scanner.next();
            char[] b = a.toCharArray();
            int num = 0;
            for (int i = 0; i < b.length; i++) {
                num += getNum(b[i]) * Math.pow(26, b.length - i - 1);
            }
            System.out.println(num);
        }
    }

    public static int getNum(char a) {
        return a - 64;
    }
}

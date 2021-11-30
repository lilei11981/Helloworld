package com.company.algorithm.mt.mt;


import java.util.Scanner;

public class MT42 {
    public static void main(String[] args) {
//        System.out.println(intToBinaryString(32));
//        System.out.println(Integer.toBinaryString(32));
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String c = intToBinaryString(a);
        String d = intToBinaryString(b);
        int length = c.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (c.charAt(i) != d.charAt(i)) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static String intToBinaryString(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            stringBuilder.append((num & (1 << i)) == 0 ? "0" : "1");
        }
        return stringBuilder.toString();
    }
}

package com.company.algorithm.mt.mt;

import java.util.Scanner;

public class MT28 {
    public static void main(String[] args) {
//        String[] a = {"134","135"};
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, a);
//        System.out.println(list.contains("134"));
//        System.out.println(judge("13312345678"));
        Scanner s = new Scanner(System.in);
        int num = Integer.parseInt(s.nextLine());
        String[] strings = new String[num];
        for (int i = 0; i < num; i++) {
            strings[i] = s.nextLine();
        }
        for (String string : strings) {
            System.out.println(judge(string));
        }
//        if (s.hasNextLine()) {
//            int num = s.nextInt();
//            System.out.println(num);
//        }
//        while(s.hasNextLine()) {
//            String string = s.nextLine();
//            System.out.println(string);
//            System.out.println(judge(string));
//        }
    }

    public static String judge(String s) {
        if (s == null || s.length() != 11) {
            return "-1";
        }
        int[] a = {133, 153, 180, 181, 189};
        int[] b = {130, 131, 155, 185, 186};
        int[] c = {135, 136, 150, 182, 188};
        int num = Integer.parseInt(s.substring(0, 3));
        for (int n : a) {
            if (n == num) {
                return "China Telecom";
            }
        }
        for (int n : b) {
            if (n == num) {
                return "China Unicom";
            }
        }
        for (int n : c) {
            if (n == num) {
                return "China Mobile Communications";
            }
        }
        return "-1";
    }
}

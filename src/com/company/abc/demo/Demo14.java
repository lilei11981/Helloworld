package com.company.abc.demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lilei
 * @date 2020-07-20 16:38
 * @apiNote 求一个字符串的最大不重复子串
 */

public class Demo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            System.out.println(getMaxSubString(string));
        }
    }

    private static String getMaxSubString(String s) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (!list.contains(s.substring(i, j))) {
                    list.add(s.substring(i, j));
                }
            }
        }
        ArrayList<String> strings = new ArrayList<>();
        for (String string : list) {
            if (checkString(string)) {
                strings.add(string);
            }
        }
        String result = strings.get(0);
        for (String string : strings) {
            if (string.length() > result.length()) {
                result = string;
            }
        }
        return result;
    }


    private static boolean checkString(String s) {
        ArrayList<Character> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (!list.contains(aChar)) {
                list.add(aChar);
            } else {
                return false;
            }
        }
        return true;
    }
}

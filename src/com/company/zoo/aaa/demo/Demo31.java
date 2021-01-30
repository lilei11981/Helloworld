package com.company.zoo.aaa.demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lilei
 * @date 2021-01-29 下午3:49
 * @apiNote
 */

public class Demo31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            System.out.println(method2(s));
        }
    }

    private static void method(String s) {

        int oldNum = 0, newNum = 0;
        if (s.length() == 0) {
            oldNum = 0;
        } else if (s.length() == 1) {
            oldNum = 1;
        } else {
            for (int i = 0; i < s.length(); i++) {
                ArrayList<Character> list = new ArrayList<>();
                list.add(s.charAt(i));
                for (int j = i + 1; j < s.length(); j++) {
                    if (!list.contains(s.charAt(j))) {
                        list.add(s.charAt(j));
                        newNum = list.size();
                    } else {
                        break;
                    }
                }
                if (oldNum <= newNum) {
                    oldNum = newNum;
                }
            }
        }
        System.out.println(oldNum);
    }

    private static void method1(String s) {
        String result = "";
        int newNum = 0, oldNum = 0;
        ArrayList<Character> newList = new ArrayList<>();
        if (s.length() == 1) {
            result = s;
        } else {
            for (int i = 0; i < s.length(); i++) {
                ArrayList<Character> list = new ArrayList<>();
                list.add(s.charAt(i));
                for (int j = i + 1; j < s.length(); j++) {
                    if (!list.contains(s.charAt(j))) {
                        list.add(s.charAt(j));
                        newNum = list.size();
                    } else {
                        break;
                    }
                }
                if (oldNum <= newNum) {
                    oldNum = newNum;
                    newList = new ArrayList<>(list);
                }
            }
            for (Character character : newList) {
                result += character;
            }
        }
        System.out.println(result);
    }

    private static boolean method2(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

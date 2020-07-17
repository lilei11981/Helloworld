package com.company.abc.hw;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author lilei
 * @date 2020-07-16 13:04
 * @apiNote
 */

public class Test40 {
    static HashMap<String, String> hashMap = new HashMap<>(10);
    private static String[] numbers = {"壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "零"};
    private static String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

    static {
        for (int i = 0; i < 10; i++) {
            hashMap.put(nums[i], numbers[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            String[] strings = string.split("\\.");
            String a = strings[0];
            String b = strings[1];
            if ("0".equals(a)) {
                System.out.println("人民币" + outputAfter(b));
            } else {
                System.out.println("人民币" + deal8Plus(a) + "元" + outputAfter(b));
            }
        }
    }

    private static String outputAfter(String a) {
        String b = "";
        if ("00".equals(a.substring(0, 2))) {
            b = "整";
        } else if ("0".equals(a.substring(0, 1))) {
            b = hashMap.get(a.substring(1, 2)) + "分";
        } else if ("0".equals(a.substring(1, 2))) {
            b = hashMap.get(a.substring(0, 1)) + "角";
        } else {
            b = hashMap.get(a.substring(0, 1)) + "角" + hashMap.get(a.substring(1, 2)) + "分";
        }
        return b;
    }

    private static String outputBefore(String a) {
        String b = "";
        String c = "";
        if (a.length() == 4) {
            if ("000".equals(a.substring(0, 3))) {
                a = a.substring(3);
                c = "零";
            } else if ("00".equals(a.substring(0, 2))) {
                a = a.substring(2);
                c = "零";
            } else if ("0".equals(a.substring(0, 1))) {
                a = a.substring(1);
                c = "零";
            }
        }
        switch (a.length() % 4) {
            case 1:
                b += hashMap.get(a.substring(0, 1));
                break;
            case 2:
                if ("1".equals(a.substring(0, 1)) && !"0".equals(a.substring(1, 2))) {
                    b += "拾" + hashMap.get(a.substring(1, 2));
                } else if ("1".equals(a.substring(0, 1)) && "0".equals(a.substring(1, 2))) {
                    b += "拾";
                } else if ("0".equals(a.substring(1, 2))) {
                    b += hashMap.get(a.substring(0, 1)) + "拾";
                } else {
                    b += hashMap.get(a.substring(0, 1)) + "拾" + hashMap.get(a.substring(1, 2));
                }
                break;
            case 3:
                if ("00".equals(a.substring(1, 3))) {
                    b += hashMap.get(a.substring(0, 1)) + "佰";
                } else if ("0".equals(a.substring(2, 3))) {
                    b += hashMap.get(a.substring(0, 1)) + "佰" + hashMap.get(a.substring(1, 2)) + "拾";
                } else if ("0".equals(a.substring(1, 2))) {
                    b += hashMap.get(a.substring(0, 1)) + "佰" + "零" + hashMap.get(a.substring(2, 3));
                } else {
                    b += hashMap.get(a.substring(0, 1)) + "佰" + hashMap.get(a.substring(1, 2)) + "拾" + hashMap.get(a.substring(2, 3));
                }
                break;
            case 0:
            default:
                if ("000".equals(a.substring(1, 4))) {
                    b += hashMap.get(a.substring(0, 1)) + "仟";
                } else if ("00".equals(a.substring(1, 3))) {
                    b += hashMap.get(a.substring(0, 1)) + "仟" + "零" + hashMap.get(a.substring(3, 4));
                } else if ("00".equals(a.substring(2, 4))) {
                    b += hashMap.get(a.substring(0, 1)) + "仟" + hashMap.get(a.substring(1, 2)) + "佰";
                } else if ("0".equals(a.substring(1, 2))) {
                    b += hashMap.get(a.substring(0, 1)) + "仟" + "零" + hashMap.get(a.substring(2, 3)) + "拾" + hashMap.get(a.substring(3, 4));
                } else if ("0".equals(a.substring(2, 3))) {
                    b += hashMap.get(a.substring(0, 1)) + "仟" + hashMap.get(a.substring(1, 2)) + "佰" + "零" + hashMap.get(a.substring(3, 4));
                } else if ("0".equals(a.substring(3, 4))) {
                    b += hashMap.get(a.substring(0, 1)) + "仟" + hashMap.get(a.substring(1, 2)) + "佰" + hashMap.get(a.substring(2, 3)) + "拾";
                } else {
                    b += hashMap.get(a.substring(0, 1)) + "仟" + hashMap.get(a.substring(1, 2)) + "佰" + hashMap.get(a.substring(2, 3)) + "拾" + hashMap.get(a.substring(3, 4));
                }
        }
        return c + b;
    }

    private static String deal8Plus(String a) {
        String b = "";
        int length = a.length();
        if (length <= 4) {
            b = outputBefore(a);
        } else if (length <= 8) {
            b = deal4Plus(a);
        } else {
            b = deal8Plus(a.substring(0, length - 8)) + "亿" + deal4Plus(a.substring(length - 8, length));
        }
        return b;
    }

    private static String deal4Plus(String a) {
        int length = a.length();
        if (length == 8) {
            if ("00000000".equals(a)) {
                return "";
            } else if ("0000".equals(a.substring(0, 4))) {
                return "零" + outputBefore(a.substring(4, 8));
            } else {
                return outputBefore(a.substring(0, length - 4)) + "万" + outputBefore(a.substring(length - 4));
            }
        } else {
            return outputBefore(a.substring(0, length - 4)) + "万" + outputBefore(a.substring(length - 4));
        }
    }
}

package com.company.algorithm.hw;

/**
 * @author lilei
 * @date 2021-02-01 下午2:46
 * @apiNote 判断IP
 */

public class Test54 {

    public static void main(String[] args) {

        System.out.println(checkIpv4("127.0.0.1"));
        System.out.println(checkIpv4("172.16.254.1"));
        System.out.println(checkIpv4("172.16.254.01 "));
        System.out.println(checkIpv6("2001:db8:85a3:0:0:8A2E:0370:7334"));
        System.out.println(checkIpv6("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));
        System.out.println(checkIpv6("2001:0db8:85a3::8A2E:0370:7334"));
        System.out.println(checkIpv6("02001:0db8:85a3:0000:0000:8a2e:0370:7334"));
        System.out.println(solve("2001:0db8:85a3::8A2E:0370:7334"));
    }

    public static String solve(String IP) {
        // write code here

        if (checkIpv4(IP)) {
            return "IPv4";
        }

        if (checkIpv6(IP)) {
            return "IPv6";
        }

        return "Neither";
    }

    public static boolean checkIpv4(String ip) {
        if (ip == null) {
            return false;
        }
        String[] strings = ip.split("\\.");
        if (strings.length != 4) {
            return false;
        }
        for (String string : strings) {
            if (string.length() > 1 && string.startsWith("0")) {
                return false;
            }
            try {
                int value = Integer.parseInt(string);
                if (value < 0 || value > 255) {
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIpv6(String ip) {
        if (ip == null) {
            return false;
        }
        String[] strings = ip.split(":");
        if (strings.length != 8) {
            return false;
        }
        for (String string : strings) {
            if (string.length() == 0 || string.length() > 4) {
                return false;
            }
            char[] chars = string.toCharArray();
            for (char c : chars) {
                if (!(c >= '0' && c <= '9' || c >= 'A' && c <= 'F' || c >= 'a' && c <= 'f')) {
                    return false;
                }
            }
        }
        return true;
    }
}

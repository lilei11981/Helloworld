package com.company.algorithm.nc;

public class NC103 {


    public static String solve (String str) {
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
//        String str = "abcd";
        String str = null;
        System.out.println(solve(str));
    }
}

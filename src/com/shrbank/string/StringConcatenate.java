package com.shrbank.string;

/**
 * Created by lilei on 2017/9/1 下午3:52.
 */
public class StringConcatenate {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000000; i++) {
            String result = "This is " + "testing the " + "difference " + "between the String " + "and the StringBuffer";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("字符串拼接" + "使用 “+” 操作符 ：" + (endTime - startTime) + " ms");

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 50000000; i++) {
            StringBuffer result = new StringBuffer();
            result.append("This is ");
            result.append("testing the ");
            result.append("difference ");
            result.append("between the String ");
            result.append("and the StringBuffer");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("字符串拼接" + "使用 StringBuffer : " + (endTime1 - startTime1) + " ms");
    }
}

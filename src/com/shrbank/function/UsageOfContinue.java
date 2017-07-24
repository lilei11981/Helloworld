package com.shrbank.function;

/**
 * Created by lilei on 2017/7/24 上午9:35.
 * Java continue语句用来结束当前循环，并进入下一次循环，即仅仅是这一次循环结束了，不是所有的循环结束了，后面的循环依旧进行。
 */


public class UsageOfContinue {
    public static void main(String[] args) {
        StringBuffer searchString = new StringBuffer("hello, how are you?");
        int length = searchString.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (searchString.charAt(i) != 'h') {
                continue;
            }
            count++;
            searchString.setCharAt(i, 'h');
        }

        System.out.println("发现 " + count + " 个 h 字符");
        System.out.println(searchString);
    }
}

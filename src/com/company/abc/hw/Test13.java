package com.company.abc.hw;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-09-18
 * Time: 下午5:25
 * Description:
 * 拆分字符串，字符串中含有逗号和数字，对数字排序并输出
 */

public class Test13 {
    public static void main(String[] args) {
        String stringNum = "146,133,131,145";
        String[] strings = stringNum.split(",");

        // 输出数组
        System.out.println(Arrays.toString(strings));

        int[] sortArray = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            sortArray[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(sortArray);

        // 输出排序后数组
        System.out.println(Arrays.toString(sortArray));

        for (int number : sortArray) {
            System.out.print(number + " ");
        }
    }
}

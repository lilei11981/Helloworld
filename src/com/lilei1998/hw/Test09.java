package com.lilei1998.hw;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-09-13
 * Time: 下午3:35
 * Description:
 * 输入字符串长度len1，字符串s1，字符串长度len2，字符串s2。
 * 从后向前比较，以最短字符串为标准，输出不同的元素的个数。
 * <p>
 * 输入：
 * s1="1,3,5"
 * len1=3
 * s2="2,4,1,7,5"
 * len2=5
 * 输出：1
 */

public class Test09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s1 = scanner.nextLine();
            String len1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            String len2 = scanner.nextLine();
            int diffNum = getDiffNum(s1, Integer.parseInt(len1), s2, Integer.parseInt(len2));
            System.out.println(diffNum);
        }
        scanner.close();
    }

    public static int getDiffNum(String s1, int len1, String s2, int len2) {
        String[] strings1 = s1.split(",");
        String[] strings2 = s2.split(",");
        int len = len1 > len2 ? len2 : len1;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (!strings1[len1 - 1 - i].equals(strings2[len2 - 1 - i]))
                count++;
        }
        return count;
    }
}

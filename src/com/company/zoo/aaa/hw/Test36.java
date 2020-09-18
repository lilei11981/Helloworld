package com.company.zoo.aaa.hw;

import java.util.Arrays;

/**
 * @author lilei
 * @time 2019-06-09 16:22
 * @description 数组的循环移位
 */

public class Test36 {
    public static void main(String[] args) {
        char[] buf = {'a', 'b', 'c', 'd', 'e'};
        int n = 8;
        perm(buf, n);
    }

    public static char[] perm(char[] buf, int n) {
        if (buf == null || buf.length == 0) {
            return null;
        }
        if (n == 0) {
            return buf;
        }
        int len = buf.length;
        char[] c = new char[len];
        int rel = n % len;
        if (n > 0) {
            for (int i = 0; i < len; i++) {
                c[(i + rel) % len] = buf[i];
            }
        } else {
            for (int i = 0; i < len; i++) {
                if (i + rel < 0) {
                    c[i + len + rel] = buf[i];
                } else {
                    c[i + rel] = buf[i];
                }
            }
        }
        System.out.println(Arrays.toString(c));
        return c;
    }
}

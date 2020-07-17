package com.company.zoo.abc.demo08;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilei
 * @date 2020-06-28 16:58
 * @apiNote 没效果
 */

public class OutOfMemory01 {
    static final int MB = 1024 * 512;

    static String createLongString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append('a');
        }
        sb.append(System.nanoTime());
        return sb.toString();
    }

    public static void main(String[] args) {
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            String longStr = createLongString(MB);
            String subStr = longStr.substring(1, 10);
            substrings.add(subStr);
        }
    }
}

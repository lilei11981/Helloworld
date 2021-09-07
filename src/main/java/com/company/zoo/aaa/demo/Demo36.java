package com.company.zoo.aaa.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lilei
 * @date 2021-08-28 上午12:08
 * @apiNote
 */

public class Demo36 {
    private final static String FIELD_SPLIT = "\u0001";
    private final static String LINE_SPLIT = "\u000F";

    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("/Users/lilei/Downloads/demo/TP_BLACK_LIST_TB_20210822.dat");
        byte[] bytes = new byte[1024];
        int len;
        StringBuilder stringBuilder = new StringBuilder();
        while ((len = inputStream.read(bytes)) != -1) {
            stringBuilder.append(new String(bytes, 0, len));
        }
        String string = stringBuilder.toString();
        String[] strings = string.split(LINE_SPLIT);
        int n = strings.length;
        System.out.println(n);
        String listValue;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            listValue = strings[i].split(FIELD_SPLIT)[4];
            if (map.get(listValue) == null) {
                map.put(listValue, 1);
            } else {
                int x = map.get(listValue);
                map.put(listValue, ++x);
            }
        }
        int num = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                num++;
            }
            if (entry.getValue() == 3) {
                num += 2;
            }
        }
        System.out.println(num);
        System.out.println(n - num);
    }
}

package com.company.algorithm.hw;

import java.io.UnsupportedEncodingException;

/**
 * @author lilei
 * @time 2019-06-09 16:11
 * @description
 */

public class Test35 {
    public static void main(String[] args) {
        String s = "我ABC汉DEF";
        int len = 6;
        System.out.println("原字符串---->" + s);
        Test35 hw = new Test35();
        String result = hw.getString(s, len);
        System.out.println("题目结果---->" + result);
    }

    public String getString(String s, int len) {
        //防各种测试用例
        if (len <= 0) {
            return "";
        }
        if (s.getBytes().length <= len) {
            return s;
        }
        if (s == null || s.equals("")) {
            return "";
        } else {
            //只需在len前查询汉字个数
            String news = s.substring(0, len);
            System.out.println("news---->" + news);
            int n = 0;
            try {
                //汉字个数
                n = news.getBytes("GBK").length - len;
                System.out.println("news.getBytes().length---->" + news.getBytes("GBK").length);
                System.out.println("n---->" + n);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return news.substring(0, len - n);
        }
    }
}

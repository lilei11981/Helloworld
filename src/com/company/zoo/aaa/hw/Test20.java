package com.company.zoo.aaa.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-09
 * Time: 5:10 PM
 * Description:
 * 输入一段字符串，字符串中只包含大小写字母。
 * 要求完成函数删除给定字符串中出现次数最少的字符。
 * 输出删除完的字符串。如果有多个出现次数一样的字符，都为最少时，一并删除。
 */

public class Test20 {
    public static void main(String[] args) {
        String inputString = "abbccd";
        Test20 test = new Test20();
        String result = test.removeMinString(inputString);
        System.out.println("最后的结果：" + result);

    }

    public String removeMinString(String input) {
        System.out.println("原字符串：" + input);
        char[] chars = input.toCharArray();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i] + "");
        }
        int minTime = 0;
        int[] count = new int[list.size()];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count[i]++;
                }
            }
            minTime = count[1];
            if (minTime >= count[i]) {
                minTime = count[i];
            }
        }
        System.out.println("每个下标的字母对应的出现次数：" + Arrays.toString(count));
        System.out.println("字母出现的最小次数" + minTime);

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < count.length; i++) {
            if (count[i] > minTime) {
                stringBuffer.append(list.get(i));
            }
        }
        return stringBuffer.toString();
    }
}

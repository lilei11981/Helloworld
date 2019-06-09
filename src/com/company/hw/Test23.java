package com.company.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-15
 * Time: 3:20 PM
 * Description:
 * 输入一个字符串，删除重复前面的字符，其余字符按原样顺序输出.
 * 例如：
 * 输入：input: "acbdfdffZZet";
 * 输出：output:"acbdfZet";
 * 实现函数：deleteString(String input)
 */

public class Test23 {
    public static void main(String[] args) {
        Test23 test = new Test23();
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String result = test.deleteString(string);
        System.out.println(result);
    }

    public String deleteString(String inputString) {
        System.out.println("原字符串：" + inputString);
        char[] chars = inputString.toCharArray();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i] + "");
        }
        System.out.println("原list：" + list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println("list删除重复后：" + list);
        System.out.println("测试list.toString()：" + list.toString());
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            stringBuffer.append(list.get(i));
        }
        return stringBuffer.toString();
    }
}

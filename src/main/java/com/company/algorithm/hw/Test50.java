package com.company.algorithm.hw;

import java.util.Stack;

/**
 * @author lilei
 * @date 2021-02-01 下午1:43
 * @apiNote 给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
 * 括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。
 */

public class Test50 {
    public static boolean judge(String s) {
        if (s == null) {
            return false;
        }
        boolean flag = true;
        while (flag) {
            int length = s.length();
            s = s.replace("{}", "");
            s = s.replace("[]", "");
            s = s.replace("()", "");
            if (length == s.length()) {
                flag = false;
            }
        }
        return s.length() == 0;
    }

    public static void main(String[] args) {
        System.out.println(judge1("{]([]{})"));
    }

    public static boolean judge1(String s) {
        if (s == null) {
            return false;
        }

        if (s.length() % 2 != 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (stack.empty()) {
                stack.push(c);
                continue;
            }
            if (c == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}

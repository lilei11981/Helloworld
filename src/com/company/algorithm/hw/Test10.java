package com.company.algorithm.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-09-14
 * Time: 上午10:52
 * Description:
 * 输入一个表达式，没有括号，数字小于0-9之间，输出计算结果，所有的中间结果化为整形
 * <p>
 * 输入：3+8×2/9-2
 * 输出：2
 */

public class Test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String expression = scanner.nextLine();
            int result = getAnswer(expression);
            System.out.println(result);
        }
        scanner.close();
    }

    public static int getAnswer(String expression) {
        int length = expression.length();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(expression.charAt(i) + "");
            if (list.get(i).equals("*")) {  // 当乘号为*时用×替换
                list.add(i, "×");
                list.remove(i + 1);
            } else if (list.get(i).equals("/")) {  // 当除号为/时用÷替换
                list.add(i, "÷");
                list.remove(i + 1);
            }
        }
        System.out.println(list);
        // 先算乘除，把结果放入，注意位置，并去除
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).equals("×")) {
                int product = Integer.parseInt(list.get(j - 1)) * Integer.parseInt(list.get(j + 1));
                list.add(j - 1, product + "");
                list.remove(j);
                list.remove(j);
                list.remove(j);
                System.out.println(list);
                // 因为数字存在 j-1 位置，操作完之后要把操作数-1
                j--;
            } else if (list.get(j).equals("÷")) {
                int quotient = Integer.parseInt(list.get(j - 1)) / Integer.parseInt(list.get(j + 1));
                list.add(j - 1, quotient + "");
                list.remove(j);
                list.remove(j);
                list.remove(j);
                System.out.println(list);
                j--;
            }
        }
        // 后算加减
        for (int k = 0; k < list.size(); k++) {
            if (list.get(k).equals("+")) {
                int sum = Integer.parseInt(list.get(k - 1)) + Integer.parseInt(list.get(k + 1));
                list.add(k - 1, sum + "");
                list.remove(k);
                list.remove(k);
                list.remove(k);
                System.out.println(list);
                k--;
            } else if (list.get(k).equals("-")) {
                int diff = Integer.parseInt(list.get(k - 1)) - Integer.parseInt(list.get(k + 1));
                list.add(k - 1, diff + "");
                list.remove(k);
                list.remove(k);
                list.remove(k);
                System.out.println(list);
                k--;
            }
        }
        return Integer.parseInt(list.get(0));
    }
}

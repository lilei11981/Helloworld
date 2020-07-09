package com.company.abc.hw;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-09-11
 * Time: 下午2:19
 * Description:
 * 掷骰子，初始序列1,2,3,4,5,6分别代表左，右，前，后，上，下
 * <p>
 * 输入翻转序列，保证只包含L,R,F,B,A,C
 * <p>
 * L:向左翻转
 * <p>
 * R:向右翻转
 * <p>
 * F:向前翻转
 * <p>
 * B:向后翻转
 * <p>
 * A:逆时针翻转
 * <p>
 * C:顺时针翻转
 * <p>
 * 输出最终序列
 * <p>
 * 比如
 * <p>
 * 输入：LA
 * 输出：435621
 */

public class Test07 {
    private static int[] state = {1, 2, 3, 4, 5, 6};

    public static void left() {
        int temp1 = state[0];
        int temp2 = state[1];
        state[0] = state[4];
        state[1] = state[5];
        state[4] = temp2;
        state[5] = temp1;
    }

    public static void right() {
        int temp1 = state[0];
        int temp2 = state[1];
        state[0] = state[5];
        state[1] = state[4];
        state[4] = temp1;
        state[5] = temp2;
    }

    public static void forward() {
        int temp1 = state[2];
        int temp2 = state[3];
        state[2] = state[4];
        state[3] = state[5];
        state[4] = temp2;
        state[5] = temp1;
    }

    public static void back() {
        int temp1 = state[2];
        int temp2 = state[3];
        state[2] = state[5];
        state[3] = state[4];
        state[4] = temp1;
        state[5] = temp2;
    }

    public static void against() {
        int temp1 = state[0];
        int temp2 = state[1];
        state[0] = state[3];
        state[1] = state[2];
        state[2] = temp1;
        state[3] = temp2;
    }

    public static void clock() {
        int temp1 = state[0];
        int temp2 = state[1];
        state[0] = state[2];
        state[1] = state[3];
        state[2] = temp2;
        state[3] = temp1;
    }


    public static void gamble(char[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == 'L') {
                left();
            }
            if (strings[i] == 'R') {
                right();
            }
            if (strings[i] == 'F') {
                forward();
            }
            if (strings[i] == 'B') {
                back();
            }
            if (strings[i] == 'A') {
                against();
            }
            if (strings[i] == 'C') {
                clock();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            for (int i = 0; i < state.length; i++) {
                state[i] = i + 1;
            }
            state[0] = 1;
            state[1] = 2;
            state[2] = 3;
            state[3] = 4;
            state[4] = 5;
            state[5] = 6;
            String string = scanner.next();
            char[] strings = string.toCharArray();
            gamble(strings);
            for (int i = 0; i < state.length; i++) {
                System.out.print(state[i]);
            }
        }
        scanner.close();
    }
}

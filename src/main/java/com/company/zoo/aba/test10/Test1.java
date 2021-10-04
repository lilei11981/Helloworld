package com.company.zoo.aba.test10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lilei
 * @date 2021-10-02 下午11:09
 * @apiNote
 */

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        System.out.println(method(line1, line2));
    }

    private static int method(String line1, String line2) {
        String[] strings1 = line1.split("\\s");
        String[] strings2 = line2.split("\\s");
        int n = Integer.parseInt(strings1[0]);
        int x = Integer.parseInt(strings1[1]);
        int y = Integer.parseInt(strings1[2]);
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(strings2[i]);
        }
        Arrays.sort(scores);
        int notOk = n - y;
        if (notOk > y) {
            return -1;
        } else if (notOk >= x && notOk <= y) {
            return scores[notOk - 1];
        } else {
            return scores[x - 1];
        }


    }
}

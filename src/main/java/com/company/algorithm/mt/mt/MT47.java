package com.company.algorithm.mt.mt;

import java.util.Arrays;

public class MT47 {
    static int cnt = 0;

    public static void help(int[] arr, int minPre) {
        if (arr.length <= 0) {
            return;
        }
        if (arr.length == 1) {
            cnt += arr[0] - minPre;
            return;
        }
        int min = Integer.MAX_VALUE, minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        cnt += min - minPre;
        if (minIndex > 0) {
            help(Arrays.copyOfRange(arr, 0, minIndex), min);
        }
        if (minIndex < arr.length - 1) {
            help(Arrays.copyOfRange(arr, minIndex + 1, arr.length), min);
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] ints = new int[n];
//        for (int i = 0; i < n; i++) {
//            ints[i] = scanner.nextInt();
//        }

        int[] ints = {4, 1, 8, 2, 5};
        // 1+4+2+5+2
//        System.out.println(Arrays.toString(Arrays.copyOfRange(ints, 0, 1)));

        help(ints, 0);
//        System.out.println(cnt);
        //注释部分为暴力模拟
//        solve(ints, n);
    }

    public static void solve(int[] ints, int n) {
        int index = 0, cnt = 0;
        while (index < n) {
            while (index < n && ints[index] == 0) {
                index++;
            }
            for (int i = index; i < n; i++) {
                if (ints[i] == 0) {
                    break;
                } else {
                    ints[i]--;
                }
            }
            if (index < n) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

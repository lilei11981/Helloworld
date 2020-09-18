package com.company.zoo.aaa.demo;

/**
 * @author lilei
 * @date 2020-07-12 17:09
 * @apiNote
 */

public class Demo11 {

    public static boolean addEqualsNum(int[] a, int i, int sum) {
        if (sum == 0) {
            return true;
        } else if (i == 0) {
            return a[0] == sum;
        } else if (a[i] > sum) {
            return addEqualsNum(a, i - 1, sum);
        } else {
            boolean x = addEqualsNum(a, i - 1, sum - a[i]);
            boolean y = addEqualsNum(a, i - 1, sum);
            return x || y;
        }
    }

    public static boolean dpSubset(int[] a, int b) {
        boolean[][] subset = new boolean[a.length][b + 1];
        for (int i = 0; i < a.length; i++) {
            subset[i][0] = true;
        }
        subset[0][a[0]] = true;
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < b + 1; j++) {
                if (a[i] > b) {
                    subset[i][j] = subset[i - 1][j];
                } else {
                    boolean x = subset[i - 1][b - a[i]];
                    boolean y = subset[i - 1][j];
                    subset[i][j] = x || y;
                }
            }
        }
        return subset[a.length - 1][b];
    }

    public static void main(String[] args) {
        int[] a = {3, 34, 4, 12, 5, 2};
        int sum = 10;
        System.out.println(addEqualsNum(a, a.length - 1, sum));
        System.out.println(dpSubset(a, sum));
    }

//    public static void main(String[] args) {
//        boolean[][] booleans = new boolean[3][5];
//        int count = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println(booleans[i][j]);
//                System.out.println(++count);
//            }
//        }
//    }
}

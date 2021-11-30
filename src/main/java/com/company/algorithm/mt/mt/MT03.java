package com.company.algorithm.mt.mt;

public class MT03 {
    public static void main(String[] args) {
        String a = "[[0,1,0],[2,0,0]]";
        System.out.println(a.replace('[', '{').replace(']', '}'));

        int[][] map = {{0, 1, 0}, {2, 0, 0}};
        int n = 2;
        int m = 3;
        System.out.println(countPath(map, n, m));
    }

    public static int countPath(int[][] map, int n, int m) {
        // write code here
        if (map == null || n == 0 || m == 0) {
            return 0;
        }

        return 0;
    }
}

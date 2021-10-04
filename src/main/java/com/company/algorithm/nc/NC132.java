package com.company.algorithm.nc;

import java.util.LinkedList;
import java.util.List;

public class NC132 {

    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        System.out.println(ysf(n, m));
    }

    /**
     * @param n int整型
     * @param m int整型
     * @return int整型
     */
    public static int ysf(int n, int m) {
        // write code here
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int cur = 0;
        while (list.size() > 1) {
            int size = list.size();
            int pos = (cur + m - 1) % size;
            list.remove(pos);
            cur = pos % (size - 1);
        }
        return list.get(0);
    }
}

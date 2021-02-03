package com.company.algorithm.hw;

/**
 * @author lilei
 * @date 2021-02-03 下午5:28
 * @apiNote 给定一个整形数组arr，已知其中所有的值都是非负的，将这个数组看作一个容器，请返回容器能装多少水。
 */

public class Test73 {

    /**
     * max water
     *
     * @param arr int整型一维数组 the array
     * @return long长整型
     */
    public static long maxWater(int[] arr) {
        // write code here
        if (arr == null || arr.length == 0) return 0L;
        long ans = 0;
        int l = 0, r = arr.length - 1;
        int lmax = arr[0], rmax = arr[arr.length - 1];
        while (l <= r) {
            lmax = Math.max(arr[l], lmax);
            rmax = Math.max(arr[r], rmax);
            if (lmax < rmax) {
                ans += lmax - arr[l];
                l++;
            } else {
                ans += rmax - arr[r];
                r--;
            }
        }
        return (long) ans;
    }
}

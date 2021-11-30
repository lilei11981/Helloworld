package com.company.algorithm.ali.ali.demo02greedy;

import java.util.Arrays;

/**
 * @author 李磊
 * @date 2020/7/28 22:02
 * @apiNote 算法笔试模拟题精解之“钱庄”
 * 钱庄每天能够收到很多散钱，第 i 个散钱的值 2^wi。为了便于管理，钱庄每天都
 * 会向中央银行申请兑换钱币，假设钱庄有一些散钱使得 2^k1+2^k2+...+2^km=2^x
 * （x 为非负整数），那么就可以将这些散钱兑换成一个大钱币，问在钱庄收到的这些散
 * 钱最终最少能变成几个钱币？
 * 输入一个整数 n，表示一共有 n 个钱币 (1 <= n <= 10^6)；再输入 n 个整数 wi，
 * 表示有价值 2^wi(0 <= wi <= 10^6) 的钱币。
 * 输出兑换后最少的钱币数
 * 输入：
 * 4
 * [1, 1, 2, 3]
 * 输出：
 * 1
 * 注意
 * 2^1+2^1+2^2+2^3=2^4，因此兑换后最少为一个钱币
 */

public class Main09 {
    public static void main(String[] args) {
        int n = 4;
        int[] nums = {1, 1, 2, 3};
        System.out.println(solution(n, nums));
    }

    private static int solution(int n, int[] nums) {
        Arrays.sort(nums);
        int max = nums[n - 1];
        int[] arr = new int[max + 2];
        for (int i = 0; i < n; i++) {
            arr[nums[i]]++;
        }
        int result = 0;
        for (int i = 0; i <= max; i++) {
            if (arr[i] != 0) {
                arr[i + 1] += arr[i] / 2;
            }
            if (arr[i] % 2 != 0) {
                result++;
            }
        }
        if (arr[max + 1] != 0) {
            result++;
        }
        return result;
    }
}

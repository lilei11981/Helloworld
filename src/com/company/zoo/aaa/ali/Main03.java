package com.company.zoo.aaa.ali;

import java.util.Arrays;

/**
 * @author lilei
 * @date 2020-07-28 14:27
 * @apiNote 算法笔试模拟题精解之“最大边权和”
 * 根据题意，最终需要将 n 个点连通并达到最大边权，而边权为两个点的点
 * 权之和的一半，所以一个点加入连通图的最大边权就是和点权最大的点连通。
 * 现在有 n 个点 (1<=n<=1000)，每个点都有一个值称为点权 ai(ai 为偶数， 1<=ai<=1000)，
 * 现在可以将任意两个点相连，连起来以后这条边也有一个值称为边权，这个边的边权为这两个点的点权之和的一半。
 * 现在需要你添加 n-1 条边，问将 这 n 个点连通以后 ( 连通是指任意两个点都能互相到达 ) 的最大的边权和是多少 ?
 * 输入点的数量 n 和 n 个数，表示点权的值
 * 输出最大的边权和
 */

public class Main03 {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        System.out.println(solution(a.length, a));
    }

    private static int solution(int n, int[] a) {
        Arrays.sort(a);
        int max = a[n - 1];
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            result += (a[i] + max) / 2;
        }
        return result;
    }
}

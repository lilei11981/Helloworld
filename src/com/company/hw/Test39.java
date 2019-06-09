package com.company.hw;

/**
 * @author lilei
 * @time 2019-06-09 17:09
 * @description 排序算法
 */

public class Test39 {
    // 冒泡排序
    public static void bubbleSort(int[] a, int n) {
        int i, j;
        //表示n次排序过程。
        for (i = 0; i < n; i++) {
            for (j = 1; j < n - i; j++) {
                //前面的数字大于后面的数字就交换
                if (a[j - 1] > a[j]) {
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

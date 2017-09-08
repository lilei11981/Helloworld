package com.shrbank.algorithm.quickSort;

/**
 * Created by lilei on 2017/9/7 下午3:09.
 */
public class QuickSort {

    public static void main(String[] args) {
        Quick quick = new Quick();
        quick.sort(new int[]{5,4,5,6,2,5,6,7,2},5, 2);
    }

}

class Quick {
    public static int sort(int[] arr, int low, int high) {
        int key = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= key) {
                high--;
            }
            arr[low] = arr[high];

            while (low < high && arr[low] <= key) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[high] = key;
        return high;
    }

    public static void quickSort()
}

package com.company.zoo.abc.demo10;

import java.util.Arrays;
import java.util.Random;

/**
 * @author lilei
 * @date 2020-06-29 15:29
 * @apiNote
 */

public class Demo02 {

    public static void quickSort(int[] nums, int begin, int end) {
        if (end <= begin) {
            return;
        }
        int key = begin - 1;
        for (int i = begin; i <= end; i++) {
            if (nums[i] <= nums[end]) {
                key++;
                int temp = nums[i];
                nums[i] = nums[key];
                nums[key] = temp;
            }
        }
        quickSort(nums, begin, key - 1);
        quickSort(nums, key + 1, end);
    }

    public static void main(String[] args) {
        int[] nums = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                nums[i] = random.nextInt(30);
            } else {
                nums[i] = -random.nextInt(30);
            }
        }
        System.out.println(Arrays.toString(nums));
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}

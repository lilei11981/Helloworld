package com.company.algorithm.nc;

import java.util.ArrayList;
import java.util.Arrays;

public class NC119 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        int k = 4;
        System.out.println(GetLeastNumbers_Solution(arr, k));
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null || input.length < 1) {
            return res;
        }
        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }
}

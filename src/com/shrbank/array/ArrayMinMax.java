package com.shrbank.array;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by lilei on 2017/9/1 下午4:38.
 */
public class ArrayMinMax {
    public static void main(String[] args) {
        Integer[] numbers = {8, 2, 7, 1, 4, 9, 5};
        int min = Collections.min(Arrays.asList(numbers));
        int max = Collections.max(Arrays.asList(numbers));
        System.out.println("最小值：" + min);
        System.out.println("最大值：" + max);
    }
}

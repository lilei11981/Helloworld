package com.company.abc.hw;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-27
 * Time: 2:45 PM
 * Description:
 * 要从5个人中选取2个人作为礼仪，其中每个人的身高范围为160-190
 * 要求2个人的身高差值最小（如果差值相同的话，选取其中最高的两人）
 * 以升序输出两个人的身高。
 * input：161 189 167 172 188
 * output：188 189
 */

public class Test30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        String output = selectPartner(inputString);
        System.out.println("最终结果：" + output);
    }

    public static String selectPartner(String heights) {
        System.out.println("五个人的身高：" + heights);
        String[] stringHeights = heights.split("\\s+");
        System.out.println("数组输出：" + Arrays.toString(stringHeights));
        int[] intHeights = new int[stringHeights.length];
        for (int i = 0; i < stringHeights.length; i++) {
            intHeights[i] = Integer.parseInt(stringHeights[i]);
        }
        System.out.println("排序前输出：" + Arrays.toString(intHeights));
        Arrays.sort(intHeights);
        System.out.println("排序后输出：" + Arrays.toString(intHeights));
        if (intHeights[0] < 160 || intHeights[intHeights.length - 1] > 190) {
            System.out.println("身高不符合要求！");
        }
        int[] diffs = new int[intHeights.length - 1];
        for (int i = 0; i < intHeights.length - 1; i++) {
            diffs[i] = intHeights[i + 1] - intHeights[i];
        }
        System.out.println("差值数组：" + Arrays.toString(diffs));
        int minDiffs = diffs[0];
        int diffsIndex = 0;
        for (int i = 0; i < diffs.length; i++) {
            if (minDiffs >= diffs[i]) {
                minDiffs = diffs[i];
                diffsIndex = i;
            }
        }
        return intHeights[diffsIndex] + " " + intHeights[diffsIndex + 1];
    }
}

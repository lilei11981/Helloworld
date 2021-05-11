package com.company.algorithm.hw;

import java.util.Arrays;

/**
 * @author lilei
 * @time 2019-06-09 15:09
 * @description 输入字符串长度，字符串，计数m。
 * 从前往后计数，当数到m个元素时，m个元素出列，同时将该元素赋值给m，
 * 然后从下一个数计数循环，直到所有数字都出列，给定的数全部为大于0的数字。输出出队队列。
 * 例如:
 * 输入：len=4    str="3,1,2,4"   m=7
 * 输出：2,3,1,4
 * 最简单的约瑟夫环，数组实现！
 * 出局的数放在新数组，把该数置为新的m;
 * 并把该出局的数置为-1，i++并把j又从1开始；
 * 每次都整个遍历原数组，遇到-1时i加而j不加。
 */

public class Test33 {
    public static void main(String[] args) {
        String originString = "3,1,2,4";
        int len = 4;
        int m = 7;
        int[] result = circle(originString, len, m);  //[2, 3, 1, 4]
        System.out.println(Arrays.toString(result));
    }

    public static int[] circle(String originString, int len, int m) {
        String[] currentString = originString.split(",");
        int[] circleArray = new int[len];
        for (int i = 0; i < currentString.length; i++) {
            circleArray[i] = Integer.parseInt(currentString[i]);
        }
        int[] newArray = new int[len];//新数组，存放依次出来的人
        int left = len;//用来标识结束循环。
        int i = 0;//原数组。。
        int j = 1;//要删除的。。。
        int k = 0;//新数组初始下标。
        while (left > 0) {
            // !!!!!!!!!!!!!i%m的作用在于当i=m-1，即读到最后一个数时，继续读下一个，即第0个！
            if (circleArray[i % len] > 0) {
                if (j == m) {
                    newArray[k++] = circleArray[i % len];
                    m = circleArray[i % len];//把这个值置为新的m.  !!!!!!!!!!!
                    circleArray[i % len] = -1;
                    left--;
                    i++;
                    j = 1;
                } else {
                    i++;
                    j++;
                }
                //为-1时只是i加而j不加。
            } else {
                i++;
            }
        }
        return newArray;
    }
}

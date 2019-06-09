package com.company.function;

/**
 * Created by lilei on 2017/7/21 下午5:03.
 * break关键字的用法
 * Java break语句可以直接强行退出当前的循环，忽略循环体中任何其他语句和循环条件测试
 */
public class UsageOfBreak {
    public static void main(String[] args) {
        int[] intArray = {99, 12, 22, 34, 45, 67, 5678, 8990};
        int number = 99;
        int i = 0;
        boolean found = false;
        for (; i < intArray.length; i++) {
            if (intArray[i] == number) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(number + " 元素的索引位置在：" + i);
        } else {
            System.out.println(number + " 元素不在数组中");
        }
    }
}

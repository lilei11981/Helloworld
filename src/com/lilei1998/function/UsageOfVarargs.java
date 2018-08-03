package com.lilei1998.function;

/**
 * Created by lilei on 2017/7/25 上午9:54.
 * Java1.5提供了一个叫varargs的新功能，就是可变长度的参数。
 * Varargs 是variable number of arguments的意思。有时候也被简单的称为variable arguments
 * 定义实参个数可变的方法：
 * 只要在形参的“类型”和“参数名”之间加上三个连续的“.” ，就可以让它和不确定的实参相匹配
 */
public class UsageOfVarargs {
    static int sumVarargs(int... intArrays) {
        int sum, i;
        sum = 0;
        for (i = 0; i < intArrays.length; i++) {
            sum += intArrays[i];
        }
        return (sum);
    }

    public static void main(String[] args) {
        int sum = 0;
        sum = sumVarargs(new int[]{10, 12, 33});
        System.out.println("数字相加之和为：" + sum);
    }
}

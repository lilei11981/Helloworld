package com.company.zoo.aaa.hw;

/**
 * @author lilei
 * @time 2019-06-09 16:39
 * @description 写出一个程序，接受一个浮点数值，输出该数值的近似整数值。
 * 如果小数点后数值大于等于5,向上取整；小于5，则向下取整
 * -4.5 四舍五入的结果是-4
 * 4.4 四舍五入的结果是4
 */

public class Test37 {
    public static void main(String[] args) {
        double d = -23.234;
        System.out.println(getValue(d));
    }

    public static int getValue(double d) {
        if (!String.valueOf(d).contains(".")) {
            return (int) d;
        }
        String[] ss = String.valueOf(d).split("\\.");
        if (Integer.valueOf(ss[1].substring(0, 1)).intValue() < 5) {
            // 取接近它的比它小的浮点数xx.0000
            return (int) Math.floor(d);
        } else {
            //取接近它的比它大的浮点数(int)xxxx.00000
            return (int) Math.ceil(d);
        }

    }
}

package com.lilei1998.exception;

/**
 * Created by lilei on 2017/7/12.
 */
public class ExceptionChain {
    public static void main(String[] args) {
        int n = 20, result = 0;
        try {
            result = n / 0;
            System.out.println("结果为 " + result);
        } catch (ArithmeticException e) {
            System.out.println("触发算术异常：" + e);
            try {
                throw new NumberFormatException();
            } catch (NumberFormatException e1) {
                System.out.println("手动触发抛出异常：" + e1);
            }
        }
    }
}

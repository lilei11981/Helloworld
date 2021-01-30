package com.company.basic.exception;

/**
 * Created by lilei on 2017/7/12.
 * 重载方法的异常处理
 */
public class ExceptionOverload {
    private static boolean method(boolean b) {
        return !b;
    }

    private static double method(int x, double y) throws Exception {
        return x + y;
    }

    private static double method(double x, int y) throws Exception {
        return x + y - 3;
    }

    public static void main(String[] args) {
        ExceptionOverload exceptionOverload = new ExceptionOverload();
        try {
            System.out.println(method(10, 20.0));
            System.out.println(method(10.0, 20));
            System.out.println(method(false));
            System.out.println(exceptionOverload.method(10));
        } catch (Exception e) {
            System.out.println("出现异常: " + e);
        }
    }

    private double method(int i) throws Exception {
        return i / 0;
    }
}

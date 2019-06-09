package com.company.exception;

/**
 * Created by lilei on 2017/7/12.
 * 多个异常的处理（多个 catch 的使用）
 * 对异常的处理：
 * 1. 声明异常时，建议声明更为具体的异常，这样可以处理的更具体
 * 2. 对方声明几个异常，就对应几个catch块，如果多个catch块中的异常出现继承关系，则父类异常放在最下面
 */

class ExceptionClass {
    int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException { // 在功能上通过throws关键字声明该功能可能出现问题
        int[] arr = new int[a];
        System.out.println(arr[4]);   // 制造的第一处异常
        return a / b;                 // 制造的第二处异常
    }
}

public class ExceptionsDemo {
    public static void main(String[] args) {
        ExceptionClass d = new ExceptionClass();
        try {
//            int x = d.div(3,0);
//            int y = d.div(5,0);
            int z = d.div(3, 1);
//            System.out.println("x = " + x);
//            System.out.println("y = " + y);
            System.out.println("z = " + z);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("Over!");
    }
}

package com.shrbank.exception;

/**
 * Created by lilei on 2017/7/12.
 * 使用异常类的printStack()方法来获取堆栈信息
 */
public class ExceptionStack {
    public static void main(String[] args) {
        int[] array = {20, 20, 40};
        int num1 = 15, num2 = 0;
        int result = 10;
        try {
            result = num1/num2;
            System.out.println("The result is " + result);
            for (int i = 2; i >= 0; i--) {
                System.out.println("The value of array is " + array[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

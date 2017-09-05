package com.shrbank.exception;

/**
 * Created by lilei on 2017/7/11.
 * 异常处理方法
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.err.println("Caught Exception");
            System.err.println("getMessage(): " + e.getMessage());
            System.err.println("getLocalizedMessage(): " + e.getLocalizedMessage());
            System.err.println("toString(): " + e);
            System.err.println("printStackTrace(): ");
            e.printStackTrace();
        }
    }
}

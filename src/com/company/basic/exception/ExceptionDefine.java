package com.company.basic.exception;

/**
 * Created by lilei on 2017/7/12.
 * 通过继承Exception类来实现自定义异常
 */
class WrongInputException extends Exception {  // 自定义的类
    WrongInputException(String s) {
        super(s);
    }
}

class Input {
    void method() throws WrongInputException {
        throw new WrongInputException("错误输入");    // 抛出自定义的类
    }
}

public class ExceptionDefine {
    public static void main(String[] args) {
        try {
            new Input().method();
        } catch (WrongInputException wie) {
            System.out.println(wie.getMessage());
        }
    }
}

package com.lilei1998.test.ioCallback.iocallback3;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-12-04
 * Time: 下午4:37
 * Description:
 * 接口回调理解
 */

public class Test {
    public static void main(String[] args) {
        You you = new You();
        new Me(you);
    }
}

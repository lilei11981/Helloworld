package com.shrbank.exception;

/**
 * Created by lilei on 2017/7/12.
 * Java 中的Finally关键字一般与try一起使用，在程序进入try块之后，无论程序是因为异常而终止或是其他方式返回终止，finally块的内容一定会执行
 * 使用finally通过e.getMessage()来捕获异常
 */
public class ExceptionFinally {
    public static void main(String[] args) {
        new ExceptionFinally().doTheWork();
    }

    public void doTheWork() {
        Object o = null;
        for (int i = 0; i < 5; i++) {
            try {
                o = makeObj(i);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: (" + e.getMessage() + ").");
                return;
            } finally {
                System.out.println("都已执行完毕");
                if (o == null) {
                    System.exit(0);
                }
            }
        }
    }

    public Object makeObj(int type) throws IllegalArgumentException {
        if (type == 1) {
            throw new IllegalArgumentException("不是指定的类型：" + type);
        }
        return new Object();
    }
}

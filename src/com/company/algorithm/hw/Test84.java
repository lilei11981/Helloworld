package com.company.algorithm.hw;

/**
 * @author lilei
 * @date 2021/2/6 5:10 下午
 * @apiNote
 */

public class Test84 {

    private Object o = new Test84();

    public Test84() {

    }

    private void method() {
        System.out.println(1);
    }

    private void test1() {
        if (o != null) {
            this.method();
        }
    }

    private void test2() {
        Object a = o;
        if (a != null) {
            this.method();
        }
    }

    public Test84(Object o) {
        this.o = o;
    }

    public static void main(String[] args) {
        new Thread(() -> new Test84(null)).start();
//        new Thread(() -> new Test84().test1()).start();
//        new Thread(() -> new Test84().test2()).start();

//        new Thread(Runnable -> )


//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }).start();
    }


}

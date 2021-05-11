package com.company.basic.keyword.synchronizedtest;

/**
 * @author lilei
 * @date 2021-01-27 下午8:34
 * @apiNote
 */

public class SynchronizedTest01 {

    public static void main(String[] args) {

        SynchronizedTest01 synchronizedTest01 = new SynchronizedTest01();

        new Thread(SynchronizedTest01::method03).start();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            synchronizedTest01.method02();
        }).start();

    }

    public synchronized static void method03() {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("静态方法3");
    }

    public synchronized static void method04() {
        System.out.println("静态方法4");
    }

    public synchronized void method01() {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("非静态方法1");
    }

    public synchronized void method02() {
        System.out.println("非静态方法2");
    }

    public void method05() {
        synchronized (this) {
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(5);
        }
    }

    public void method06() {
        synchronized (this) {
            System.out.println(6);
        }
    }


    public void method07() {
        synchronized (SynchronizedTest01.class) {
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(6);
        }
    }

    public void method08() {
        synchronized (SynchronizedTest01.class) {
            System.out.println(6);
        }
    }


}

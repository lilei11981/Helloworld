package com.company.zoo.aab.test10;

/**
 * @author lilei
 * @date 2021-01-27 下午8:34
 * @apiNote
 */

public class Demo01 {

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
        synchronized (Demo01.class) {
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(6);
        }
    }

    public void method08() {
        synchronized (Demo01.class) {
            System.out.println(6);
        }
    }


}

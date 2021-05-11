package com.company.zoo.aab.test03;

/**
 * @author lilei
 * @date 2020-09-16 17:42
 * @apiNote
 */

public class Book {
    static Book book = new Book();
    static int amount = 112;

    static {
        System.out.println("书的静态代码块");
    }

    int price = 110;

    {
        System.out.println("书的普通代码块");
    }

    Book() {
        System.out.println("书的构造方法");
        System.out.println("price=" + price + ",amount=" + amount);
    }

    public static void main(String[] args) {
        staticFunction();
    }

    public static void staticFunction() {
        System.out.println("书的静态方法");
    }
}

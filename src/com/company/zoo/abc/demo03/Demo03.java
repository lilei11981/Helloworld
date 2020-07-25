package com.company.zoo.abc.demo03;

/**
 * @author lilei
 * @date 2020-06-28 14:12
 * @apiNote
 */

public class Demo03 {
    public static void main(String[] args) {
        Parent one = new Parent("A",1);
        System.out.println("---------------------");

        System.out.println(one);

        System.out.println("---------------------");

        Child two = new Child();
        System.out.println("---------------------");
        two.method();

        System.out.println("---------------------");
        two.method("a");

        System.out.println("---------------------");

        new Child();

    }
}

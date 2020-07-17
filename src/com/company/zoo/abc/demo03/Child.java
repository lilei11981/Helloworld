package com.company.zoo.abc.demo03;

/**
 * @author lilei
 * @date 2020-06-28 14:02
 * @apiNote
 */

public class Child extends Parent {

    public Child() {
        super();
        System.out.println("子类");
    }

    public void method(String a) {
        System.out.println("子类" + a);
    }
}

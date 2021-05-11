package com.company.zoo.aab.test11;

/**
 * @author lilei
 * @date 2021-05-05 下午3:07
 * @apiNote
 */

public class B extends A {
    public String show(B obj) {
        return ("B and B");
    }

    public String show(A obj) {
        return ("B and A");
    }
}

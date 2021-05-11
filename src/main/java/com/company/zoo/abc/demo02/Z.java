package com.company.zoo.abc.demo02;

/**
 * @author lilei
 * @date 2020-05-27 17:50
 * @apiNote
 */

class X {
    // 4 7
    Y y = new Y();

    // 3
    public X() {
        // 8
        System.out.print("X");
    }
}

class Y {
    // 5 10
    public Y() {
        // 6 11
        System.out.print("Y");
    }
}

public class Z extends X {
    // 9 12
    Y y = new Y();

    // 2
    public Z() {
        // 13
        System.out.print("Z");
    }

    public static void main(String[] args) {
        // 1 14
        new Z();
    }
}

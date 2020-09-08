package com.company.zoo.abc.demo29;

/**
 * @author lilei
 * @date 2020-09-06 14:43
 * @apiNote
 */

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}

package com.company.zoo.abc.demo29;

/**
 * @author lilei
 * @date 2020-09-06 14:48
 * @apiNote
 */

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}

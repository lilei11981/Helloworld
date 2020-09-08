package com.company.zoo.abc.demo29;

/**
 * @author lilei
 * @date 2020-09-06 15:03
 * @apiNote
 */

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("ModelDuck");
    }
}

package com.company.zoo.abc.demo29;

/**
 * @author lilei
 * @date 2020-09-06 14:59
 * @apiNote
 */

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

        Duck model = new ModelDuck();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

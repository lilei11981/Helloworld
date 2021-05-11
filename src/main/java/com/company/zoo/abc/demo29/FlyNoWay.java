package com.company.zoo.abc.demo29;

/**
 * @author lilei
 * @date 2020-09-06 14:40
 * @apiNote
 */

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}

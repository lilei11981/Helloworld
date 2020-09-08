package com.company.zoo.abc.demo29;

/**
 * @author lilei
 * @date 2020-09-06 14:45
 * @apiNote
 */

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不叫");
    }
}

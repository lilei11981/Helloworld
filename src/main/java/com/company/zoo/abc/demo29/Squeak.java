package com.company.zoo.abc.demo29;

/**
 * @author lilei
 * @date 2020-09-06 14:44
 * @apiNote
 */

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}

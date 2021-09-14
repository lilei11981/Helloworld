package com.company.zoo.aaa.demo04;

/**
 * @author lilei
 * @date 2021-09-14 下午9:26
 * @apiNote
 */

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}

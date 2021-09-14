package com.company.zoo.aaa.demo04;

/**
 * @author lilei
 * @date 2021-09-14 下午9:23
 * @apiNote
 */

public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}

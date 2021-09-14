package com.company.zoo.aaa.demo04;

/**
 * @author lilei
 * @date 2021-09-14 下午9:38
 * @apiNote
 */

public class QuackCounter implements Quackable {
    Observable observable;

    static int numberOfQuacks;
    Quackable duck;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        observable = new Observable(this);
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return duck.toString();
    }
}

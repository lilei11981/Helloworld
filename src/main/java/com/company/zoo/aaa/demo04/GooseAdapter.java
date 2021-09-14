package com.company.zoo.aaa.demo04;

/**
 * @author lilei
 * @date 2021-09-14 下午9:35
 * @apiNote 适配器
 */

public class GooseAdapter implements Quackable {

    Observable observable;

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
        return "Goose pretending to be a Duck";
    }
}

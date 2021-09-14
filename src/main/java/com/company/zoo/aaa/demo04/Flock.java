package com.company.zoo.aaa.demo04;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lilei
 * @date 2021-09-14 下午9:54
 * @apiNote
 */

public class Flock implements Quackable {
    Observable observable;

    ArrayList ducks = new ArrayList();

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable duck) {
        ducks.add(duck);
    }

    @Override
    public void quack() {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
            notifyObservers();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}

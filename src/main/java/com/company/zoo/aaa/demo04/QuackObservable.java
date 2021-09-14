package com.company.zoo.aaa.demo04;


/**
 * @author lilei
 * @date 2021-09-14 下午10:09
 * @apiNote
 */

public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}

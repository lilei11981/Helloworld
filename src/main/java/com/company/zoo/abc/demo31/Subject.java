package com.company.zoo.abc.demo31;

/**
 * @author lilei
 * @date 2020-09-06 16:04
 * @apiNote
 */

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

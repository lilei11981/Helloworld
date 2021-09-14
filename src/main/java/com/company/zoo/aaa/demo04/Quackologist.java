package com.company.zoo.aaa.demo04;

/**
 * @author lilei
 * @date 2021-09-14 下午10:24
 * @apiNote
 */

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked. ");
    }
}

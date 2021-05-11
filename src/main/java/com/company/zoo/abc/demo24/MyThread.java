package com.company.zoo.abc.demo24;

/**
 * @author lilei
 * @date 2020-08-14 19:08
 * @apiNote
 */

public class MyThread extends Thread {
    private SemaphoreService service;

    public MyThread(String name, SemaphoreService service) {
        super();
        this.setName(name);
        this.service = service;
    }

    @Override
    public void run() {
        this.service.doSomething();
    }
}

package com.company.zoo.aaa.demo05;


import javax.annotation.Resource;

/**
 * @date : 2022/3/24 15:43
 */

public class Main {

    @Resource
    AnotherInterface anotherInterface;

    public static void main(String[] args) {
        Main main = new Main();
        main.method();
    }

    public void method() {
        anotherInterface.execute();
    }
}

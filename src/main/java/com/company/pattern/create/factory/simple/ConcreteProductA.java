package com.company.pattern.create.factory.simple;

/**
 * @author lilei
 * @date 2021-05-05 下午5:30
 * @apiNote
 */

public class ConcreteProductA implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}

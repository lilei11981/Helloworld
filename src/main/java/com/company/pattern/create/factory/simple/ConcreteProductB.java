package com.company.pattern.create.factory.simple;

/**
 * @author lilei
 * @date 2021-05-05 下午5:31
 * @apiNote
 */

public class ConcreteProductB implements Product {
    @Override
    public void show() {
        System.out.println("具体产品2显示...");
    }
}

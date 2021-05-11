package com.company.pattern.create.factory.simple;

/**
 * @author lilei
 * @date 2021-05-05 下午5:33
 * @apiNote
 */

public class SimpleFactory {
    public static Product makeProduct(int kind) {
        switch (kind) {
            case Const.PRODUCT_A:
                return new ConcreteProductA();
            default:
            case Const.PRODUCT_B:
                return new ConcreteProductB();
        }
    }
}

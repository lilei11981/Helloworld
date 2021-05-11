package com.company.pattern.create.factory.method;

/**
 * @author lilei
 * @date 2021-05-05 下午5:37
 * @apiNote
 */

public interface NumberFactory {
    NumberFactory impl = new NumberFactoryImpl();

    static NumberFactory getFactory() {
        return impl;
    }

    Number parse(String s);
}

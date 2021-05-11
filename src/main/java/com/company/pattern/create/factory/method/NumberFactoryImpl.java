package com.company.pattern.create.factory.method;

import java.math.BigDecimal;

/**
 * @author lilei
 * @date 2021-05-05 下午5:37
 * @apiNote
 */

public class NumberFactoryImpl implements NumberFactory {
    @Override
    public Number parse(String s) {
        return new BigDecimal(s);
    }
}

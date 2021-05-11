package com.company.pattern.create.factory.method;

/**
 * @author lilei
 * @date 2021-05-05 下午5:40
 * @apiNote
 */

public class FactoryMethodClient {
    public static void main(String[] args) {
        NumberFactory numberFactory = NumberFactory.getFactory();
        Number result = numberFactory.parse("123.456");
        System.out.println(result);
    }
}

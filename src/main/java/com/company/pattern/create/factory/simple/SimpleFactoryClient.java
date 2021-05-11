package com.company.pattern.create.factory.simple;

/**
 * @author lilei
 * @date 2021-05-05 下午5:05
 * @apiNote
 */

public class SimpleFactoryClient {

    public static void main(String[] args) {
        Product product = SimpleFactory.makeProduct(Const.PRODUCT_B);
        product.show();
    }
}

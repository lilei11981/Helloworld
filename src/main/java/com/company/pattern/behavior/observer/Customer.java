package com.company.pattern.behavior.observer;

/**
 * @author lilei
 * @date 2021-05-13 下午1:34
 * @apiNote
 */

public class Customer implements ProductObserver {

    @Override
    public void onPublished(Product product) {
        System.out.println("[Customer] on product published: " + product);
    }

    @Override
    public void onPriceChanged(Product product) {
        System.out.println("[Customer] on product price changed: " + product);
    }
}

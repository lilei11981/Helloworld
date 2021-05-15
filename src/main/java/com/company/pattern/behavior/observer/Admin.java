package com.company.pattern.behavior.observer;

/**
 * @author lilei
 * @date 2021-05-13 下午1:33
 * @apiNote
 */

public class Admin implements ProductObserver {

    @Override
    public void onPublished(Product product) {
        System.out.println("[Admin] on product published: " + product);
    }

    @Override
    public void onPriceChanged(Product product) {
        System.out.println("[Admin] on product price changed: " + product);
    }
}

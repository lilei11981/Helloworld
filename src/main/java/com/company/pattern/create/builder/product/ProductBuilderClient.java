package com.company.pattern.create.builder.product;

/**
 * @author lilei
 * @date 2021-05-05 下午6:07
 * @apiNote
 */

public class ProductBuilderClient {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product.toString());
    }
}

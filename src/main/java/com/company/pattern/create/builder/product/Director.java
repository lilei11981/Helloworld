package com.company.pattern.create.builder.product;

/**
 * @author lilei
 * @date 2021-05-05 下午6:41
 * @apiNote
 */

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}

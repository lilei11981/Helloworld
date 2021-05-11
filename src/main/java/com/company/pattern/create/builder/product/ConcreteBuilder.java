package com.company.pattern.create.builder.product;

/**
 * @author lilei
 * @date 2021-05-05 下午6:40
 * @apiNote
 */

public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}

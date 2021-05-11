package com.company.pattern.create.builder.product;

/**
 * @author lilei
 * @date 2021-05-05 下午6:39
 * @apiNote
 */

public abstract class Builder {
    //创建产品对象
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    //返回产品对象
    public Product getResult() {
        return product;
    }
}

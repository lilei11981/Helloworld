package com.company.pattern.create.builder.house;

/**
 * @author lilei
 * @date 2021-05-05 下午6:48
 * @apiNote
 */

public class Roof {

    String shape;

    public Roof(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return this.shape;
    }
}

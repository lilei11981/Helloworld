package com.company.pattern.create.builder.house;

/**
 * @author lilei
 * @date 2021-05-05 下午6:46
 * @apiNote
 */

public class Wall {

    String material;

    public Wall(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return this.material;
    }
}

package com.company.pattern.create.builder.house;

/**
 * @author lilei
 * @date 2021-05-05 下午6:54
 * @apiNote
 */

public class HouseBuilder {

    House house = new House();

    public HouseBuilder addWall() {
        house.addWall(new Wall("stone"));
        return this;
    }

    public HouseBuilder addRoof() {
        house.addRoof(new Roof("circle"));
        return this;
    }

    public House build() {
        house.setName("hw");
        return house;
    }
}

package com.company.pattern.create.builder.house;

/**
 * @author lilei
 * @date 2021-05-05 下午7:04
 * @apiNote
 */

public class HouseBuilderClient {
    public static void main(String[] args) {
        HouseBuilder builder = new HouseBuilder();
        House house = builder.addRoof().addWall().build();
        System.out.println(house);
    }
}

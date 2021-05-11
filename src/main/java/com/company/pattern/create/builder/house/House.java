package com.company.pattern.create.builder.house;

/**
 * @author lilei
 * @date 2021-05-05 下午6:45
 * @apiNote
 */

public class House {
    String name;
    Roof roof;
    Wall wall;

    void addRoof(Roof roof) {
        this.roof = roof;
    }

    void addWall(Wall wall) {
        this.wall = wall;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", roof=" + roof +
                ", wall=" + wall +
                '}';
    }
}

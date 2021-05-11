package com.company.zoo.aab.test10;

/**
 * @author lilei
 * @date 2021-05-05 下午2:53
 * @apiNote
 */

class Animal {
    public static void walk() {
        System.out.println("Animal行走方法");
    }
}

public class Horse extends Animal {
    public static void walk() {
        System.out.println("Horse四条腿行走");
    }

    public static void main(String[] args) {
        // new Horse().walk();
        Animal.walk();
        Horse.walk();
        Animal animal = new Horse();
        animal.walk();
        Horse horse = new Horse();
        horse.walk();
        new Animal().walk();
        new Horse().walk();
    }
}

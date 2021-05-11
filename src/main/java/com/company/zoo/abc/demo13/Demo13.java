package com.company.zoo.abc.demo13;

import com.company.zoo.abc.demo12.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilei
 * @date 2020-08-04 16:21
 * @apiNote
 */

public class Demo13 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        new Demo13().test(animals, dogs);
    }

    private <T> void test(List<? super T> dst, List<T> src) {
        for (T t : src) {
            dst.add(t);
        }
    }

    // Dog 是 Animal 的子类
    class Dog extends Animal {

    }
}

package com.company.zoo.abc.demo12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilei
 * @date 2020-08-04 15:58
 * @apiNote
 */

public class Demo12 {
    static int countLegs(List<? extends Animal> animals) {
        int retVal = 0;
        for (Animal animal : animals) {
            retVal += animal.countLegs();
        }
        return retVal;
    }

    static int countLegs1(List<Animal> animals) {
        int retVal = 0;
        for (Animal animal : animals) {
            retVal += animal.countLegs();
        }
        return retVal;
    }

    public static void main(String[] args) {
        List<Animal> dogs = new ArrayList<>();
        // 不会报错
        countLegs(dogs);
        // 报错
        countLegs1(dogs);
    }

}

package com.company.java8;

import java.util.Optional;

/**
 * @author lilei
 * @date 2021-02-22 下午3:04
 * @apiNote
 */

public class OptionalClass02 {

    public static void main(String[] args) {
        Integer a = null;
        Optional<Integer> optionalInteger = Optional.ofNullable(a);
        System.out.println(optionalInteger);
    }
}

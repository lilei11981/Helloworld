package com.company.abc.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author lilei
 * @date 2020-07-07 16:10
 * @apiNote
 */

public class Stream01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Stream<Integer> stream1 = list.stream();
        Stream<Integer> stream2 = stream1.filter((a) -> a > 2);
        Stream<Integer> stream3 = stream2.skip(2);
        stream3.forEach(System.out::println);
    }
}

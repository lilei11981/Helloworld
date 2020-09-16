package com.company.collection;

import java.util.ArrayList;

/**
 * @author lilei
 * @date 2020-09-15 19:34
 * @apiNote
 */

public class ArrayListImpl<E> extends ArrayList<E> {
    public static void main(String[] args) {
        ArrayListImpl<Integer> list = new ArrayListImpl<>();
        list.add(1);
        list.add(2);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}

package com.company.java8.lambda.lambda02;

import java.util.Arrays;

/**
 * @author lilei
 * @date 2020-07-04 12:37
 * @apiNote
 */

public class Demo02 {
    public static void main(String[] args) {
        Person[] array = {
                new Person("郭靖", 45),
                new Person("黄蓉", 42),
                new Person("小龙女", 19),
                new Person("杨过", 16),
                new Person("杨康", 45)
        };

//        Arrays.sort(array, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

//        Arrays.sort(array,(Person o1, Person o2)-> {return o1.getAge() - o2.getAge();});

        Arrays.sort(array, (o1, o2) -> {
            return o1.getAge() - o2.getAge();
        });

        for (Person person : array) {
            System.out.println(person);
        }
    }
}

package com.company.zoo.abc.demo11;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author lilei
 * @date 2020-07-31 16:17
 * @apiNote
 */

public class Person {
    private Integer age;

    public Person() {
    }

    public Person(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) {
        TreeMap<Person, String> map = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        map.put(new Person(8), "person1");
        map.put(new Person(12), "person2");
        map.put(new Person(3), "person3");

        for (Map.Entry<Person, String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

        map.entrySet().forEach(System.out::println);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

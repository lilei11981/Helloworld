package com.company.zoo.aab.test04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilei
 * @date 2020-10-14 09:12
 * @apiNote
 */

public class Test04 {

    public static void main(String[] args) {
        Test04 test04 = new Test04();
        List<Person> list = test04.method();
        Person person = new Person();
        person.setName("B");
        person.setAge(13);
        list.add(person);
        for (Person newPerson : list) {
            System.out.println(newPerson);
        }
    }

    public List<Person> method() {
        List<Person> list = new ArrayList<>();
        System.out.println(list);
        Person person = new Person();
        person.setName("A");
        person.setAge(12);
        list.add(person);
        return list;
//        return Arrays.asList(person);
    }

    public static class Person {
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

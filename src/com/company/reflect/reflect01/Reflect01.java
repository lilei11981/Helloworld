package com.company.reflect.reflect01;

import java.lang.reflect.Field;

/**
 * @author lilei
 * @date 2020-07-08 15:41
 * @apiNote
 */

public class Reflect01 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<Person> personClass = Person.class;
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Field name = personClass.getDeclaredField("name");
    }
}

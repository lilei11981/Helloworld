package com.company.zoo.abc.demo25;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilei
 * @date 2020-08-20 13:46
 * @apiNote
 */

@SuppressWarnings("unchecked")
public class Demo25 {

    @Deprecated
    public static void method() {

    }

    public static void main(String[] args) {
        method();

        List list = new ArrayList();
    }

    @MyAnnotation(username = "san")
    public void test(String name) {
        System.out.println(name);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}

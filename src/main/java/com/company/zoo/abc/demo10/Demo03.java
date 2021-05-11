package com.company.zoo.abc.demo10;

/**
 * @author lilei
 * @date 2020-06-30 15:43
 * @apiNote
 */

public class Demo03 {
    public static void main(String[] args) {
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());

        System.out.println("重地".equals("通话"));
        System.out.println("重地" == "通话");
        System.out.println("abc".hashCode());

        System.out.println(System.identityHashCode("重地"));
        System.out.println(System.identityHashCode("通话"));
    }
}

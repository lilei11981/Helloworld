package com.company.zoo.abc.demo05;

/**
 * @author lilei
 * @date 2020-06-28 15:28
 * @apiNote
 */

public class Demo05 {
    public static void main(String[] args) {

//        int a = 9;
//        int b = 10;
//        System.out.println(a==b);

        User user1 = new User();
        user1.setName("AAA");

        User user2 = new User();
        user2.setName("BBB");

        System.out.println(user1.equals(user2));

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
    }
}

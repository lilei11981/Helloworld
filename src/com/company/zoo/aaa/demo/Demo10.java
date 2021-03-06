package com.company.zoo.aaa.demo;

/**
 * @author lilei
 * @date 2021-02-27 下午7:16
 * @apiNote
 */

public class Demo10 {

    // public static void main(String[] args) {
    //     Person<Object> person = new Person<>();
    //     System.out.println(person.getName());
    // }
    //
    // public static class Person<T> {
    //     T name;
    //
    //     public T getName() {
    //         return name;
    //     }
    //
    //     public void setName(T name) {
    //         this.name = name;
    //     }
    // }

    // public static void main(String[] args) {
    //     Queue<Integer> queue = new LinkedList<>();
    //     queue.add(null);
    //     System.out.println(queue.isEmpty());
    // }

    public static void main(String[] args) {
        int num = Integer.MAX_VALUE;
        long s = System.nanoTime();
        // for (int i = 0; i < 100000; i++) {
        //     a(num); // 14930550 10299969 16308387 17679512
        //     // b(num); // 7526980 9260850 9934983 7697403
        // }
        for (int i = 0; i < 10000000; i++) {
            // a(num); // 525531755 510129632
            b(num); // 386197545 363306167
        }
        long e = System.nanoTime();
        System.out.println(e - s);
    }

    public static void a(int num) {
        num = num / 2;
        if (num > 1) {
            a(num);
        }
    }

    public static void b(int num) {
        num = num >> 1;
        if (num > 1) {
            b(num);
        }
    }
}

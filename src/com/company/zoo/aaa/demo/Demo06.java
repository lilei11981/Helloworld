package com.company.zoo.aaa.demo;

import java.util.Arrays;
import java.util.Random;

/**
 * @author lilei
 * @date 2020-07-03 11:12
 * @apiNote
 */

public class Demo06 {

    // public static void main(String[] args) {
    //        Queue<Integer> queue = new LinkedList<>();
    //        Random r1 = new Random();
    //        for (int i = 0; i < 20; i++) {
    //            int num = r1.nextInt(100);
    //            queue.add(num);
    //        }
    //        System.out.println(queue);
    //        System.out.println(queue.element());
    //        System.out.println(queue.peek());
    //        System.out.println(queue.poll());
    //        System.out.println(queue.remove());
    //        System.out.println(queue);
    //        System.out.println("========================");

    //        LinkedList<Integer> linkedList = new LinkedList<>();
    //        Random r2 = new Random();
    //        for (int i = 0; i < 20; i++) {
    //            int num = r2.nextInt(100);
    //            linkedList.add(num);
    //        }
    //        System.out.println(linkedList);
    //        System.out.println(linkedList.getFirst());
    //        System.out.println(linkedList.getLast());
    //        System.out.println();

    //     long a = 100000000;
    //     long b = 10000;
    //     long result = a * b;
    //     System.out.println(result);
    //
    //
    // }

    // a - b
    // c - d

    public static int a(int a, int b) {
        Random random = new Random();
        return random.nextInt(b - a) + a;
    }

    public static int a() {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }

    public static int b(int a, int b) {
        int result;
        int mid = a + (b - a) / 2;
        if ((b - a) % 2 == 0) {
            return a(a, b) > mid ? 1 : 0;
        }
        do {
            result = a(a, b);
        } while (result == mid);
        return result > mid ? 1 : 0;
    }

    public static int b() {
        // return a() > 3 ? 1 :0;
        int result;
        do {
            result = a();
            // if (result > 3) {
            //     result = 1;
            // } else if (result < 3) {
            //     result = 0;
            // }
        } while (result == 3);
        return result > 3 ? 1 : 0;
    }

    public static int c(int a, int b, int c, int d) {
        int result;
        int num = f(c, d);
        do {
            result = 0;
            for (int i = num - 1; i >= 0; i--) {
                result += (b(a, b) << i);
            }
        } while (result > (d - c));
        return result;
    }

    public static int f(int c, int d) {
        int result = 0;
        int num = 1;
        while ((d - c) > num) {
            num *= 2;
            result++;
        }
        return result;
    }

    public static int c() {
        int result;
        do {
            result = (b() << 2) + (b() << 1) + b();
        } while (result == 7);
        return result;
    }

    public static int d() {
        return Math.random() > 0.99 ? 1 : 0;
    }

    public static int e() {
        // int result;
        // do {
        //     result = d();
        // } while (result == d());
        // return result;
        int a;
        int b;
        do {
            a = d();
            b = d();
        } while (a == b);
        return a;
    }


    public static void main(String[] args) {
        int[] array = new int[8];
        int a = 1;
        int b = 6;
        int c = 1;
        int d = 7;
        for (int i = 0; i < 30000; i++) {
            array[c(a, b, c, d)]++;
        }
        System.out.println(Arrays.toString(array));

        // System.out.println(c(a, b, c, d));


        // System.out.println(f(1,1));
    }
}

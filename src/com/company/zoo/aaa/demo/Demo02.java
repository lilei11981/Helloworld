package com.company.zoo.aaa.demo;

/**
 * @author lilei
 * @date 2020-07-01 10:25
 * @apiNote
 */

public class Demo02 {

    // public static void main(String[] args) {
    //        int[] a = {1, 3, 2};
    //        Arrays.sort(a);
    //        System.out.println(Arrays.toString(a));


    //        int[] a = null;
    //        int[] b = {1, 2};
    //        boolean isTrue = Arrays.equals(a, b);
    //        System.out.println(isTrue);
    //
    //        int hashCode = Arrays.hashCode(a);
    //        System.out.println(hashCode);
    //
    //        System.out.println(31 * 32 + 2);
    //
    //        System.out.println(Arrays.hashCode(b));


    //        int[] a = {1,2,3};
    //        Spliterator.OfInt spliterator = Arrays.spliterator(a);
    //        System.out.println(spliterator.characteristics());


    // String[] a = {"a", "c", "b"};
    // Arrays.sort(a);
    // System.out.println(Arrays.toString(a));

    // Object a = null;
    // Object b = a;
    // System.out.println(b);

    // }


    public static void main(String[] args) {
        Node head = new Node();
        System.out.println(head);
        head = head.next;
        System.out.println(head);
        head = head.next;
        System.out.println(head);
    }


    static class Node {
        int val;
        int min;
        Node next;

        public Node() {
        }

        public Node(int val, int min) {
            this(val, min, null);
        }

        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", min=" + min +
                    ", next=" + next +
                    '}';
        }
    }

}

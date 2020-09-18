package com.company.zoo.aaa.demo;

/**
 * @author lilei
 * @date 2020-07-12 14:53
 * @apiNote
 */

public class Demo09 {

//    private String hello;
//
//    public void main(String[] args) {
//        String bcd = hello + "abc";
//        System.out.println(bcd);
//        System.out.println(hello);
//        String a = "abc";
//        String b = "xyz";
//        a = a + b;
//        System.out.println(a);

//        List<String> list = new ArrayList<>();
//        list.add("a");
//        int size = list.size();
//        System.out.println(size);
//
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("b");
//        System.out.println(arrayList.size());
//
//    }

//    private static int getNum(int count) {
//        if (count == 0 || count == 1) {
//            return count;
//        } else {
//            return getNum(count-1) + getNum(count-2);
//        }
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println(getNum(8));
//    }

    private static int recOpt(int[] a) {
        if (a.length == 1) {
            return a[0];
        } else if (a.length == 2) {
            return Math.max(a[0], a[1]);
        } else {
            int[] b = new int[a.length - 2];
            for (int i = 0; i < b.length; i++) {
                b[i] = a[i];
            }
            int[] c = new int[a.length - 1];
            for (int i = 0; i < c.length; i++) {
                c[i] = a[i];
            }
            return Math.max(recOpt(c), recOpt(b) + a[a.length - 1]);
        }
    }

    public static int dpOpt(int[] a) {
        int[] b = new int[a.length];
        b[0] = a[0];
        b[1] = Math.max(a[0], a[1]);
        for (int i = 2; i < a.length; i++) {
            b[i] = Math.max(b[i - 2] + a[i], b[i - 1]);
        }
        return b[a.length - 1];
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6, 1, 2};
        int[] b = {1, 2, 4, 1, 7, 8, 3};
        System.out.println(recOpt(b));
        System.out.println(dpOpt(b));
    }
}

package com.company;

import java.math.BigDecimal;

/**
 * @date on 2017/6/10.
 * @author lilei
 * Hello World 输出
 */
public class HelloWorld {
    public static void main(String[] args) {
//        int max = max(1,2);
//        System.out.println(max);
        // System.out.printf("Hello World!");

//        float a = 0.1432f;
//        float b = 0.2f;
//        System.out.println(a + b);

//        float a = 1.0f - 0.9f;
//        float b = 0.9f - 0.8f;
//        System.out.println(a);// 0.100000024
//        System.out.println(b);// 0.099999964
//        System.out.println(a == b);// false

//        BigDecimal a = new BigDecimal("1");
//        BigDecimal b = new BigDecimal("2");
//        BigDecimal c = new BigDecimal("0.878397189378917892378917892378912738971289378192731283898989080980912389102");
//        BigDecimal x = a.subtract(b);// 0.1
//        BigDecimal z = a.divide(b);
//        BigDecimal w = z.setScale(2);
//        System.out.println(w);
//        System.out.println(x);
//        BigDecimal y = b.subtract(c);// 0.1
//        System.out.println(y);
//        System.out.println(x.equals(y)); // true
        BigDecimal a = new BigDecimal("-80538738812075974");
        BigDecimal b = new BigDecimal("80435758145817515");
        BigDecimal c = new BigDecimal("12602123297335631");
        System.out.println(a.toString().length());
        System.out.println(b.toString().length());
        System.out.println(c.toString().length());
        System.out.println(a.multiply(a).multiply(a));
        System.out.println(b.multiply(b).multiply(b));
        System.out.println(c.multiply(c).multiply(c));
        BigDecimal x = a.multiply(a).multiply(a);
        BigDecimal y = b.multiply(b).multiply(b);
        BigDecimal z = c.multiply(c).multiply(c);
        System.out.println(x.toString().length());
        System.out.println(y.toString().length());
        System.out.println(z.toString().length());
        BigDecimal j = y.add(z);
        System.out.println("-" + j);
        System.out.println(a.multiply(a).multiply(a));
        BigDecimal w = x.add(y).add(z);
        System.out.println(w);



//        BigDecimal a = new BigDecimal("1.0");
//        BigDecimal b = new BigDecimal("1.0");
//        System.out.println(a.compareTo(b));// 1
//
//        BigDecimal m = new BigDecimal("1.255433");
//        BigDecimal n = m.setScale(4, BigDecimal.ROUND_HALF_DOWN);
//        System.out.println(n);// 1.255


//        int[] myArray = { 1, 2, 3 };
//        List myList = Arrays.asList(myArray);
//        System.out.println(myList.size());//1
//        System.out.println(myList.get(0));//数组地址值
//        System.out.println(myList.get(1));//报错：ArrayIndexOutOfBoundsException
//        int [] array = (int[]) myList.get(0);
//        System.out.println(array[0]);//1

//        List myList = Arrays.asList(1, 2, 3);
//        myList.add(4);//运行时报错：UnsupportedOperationException
//        myList.remove(1);//运行时报错：UnsupportedOperationException
//        myList.clear();//运行时报错：UnsupportedOperationException

//        Integer [] myArray = { 1, 2, 3 };
//        System.out.println(arrayToList(myArray).getClass());//class java.util.ArrayList
    }

//    static <T> List<T> arrayToList(final T[] array) {
//        final List<T> l = new ArrayList<T>(array.length);
//
//        for (final T s : array) {
//            l.add(s);
//        }
//        return (l);
//    }
}

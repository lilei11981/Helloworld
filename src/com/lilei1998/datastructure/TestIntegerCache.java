package com.lilei1998.datastructure;

/**
 * Created by lilei on 2017/7/11.
 */
public class TestIntegerCache {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);
        Integer c = 1000;
        Integer d = 1000;
        System.out.println(c == d);
        Integer e = new Integer(100);
        Integer f = new Integer(100);
        System.out.println(e == f);
    }
}

/**
 * 反编译时，增加valueOf()方法
 * public static void main(String[] args) {
 * Integer a = Integer.valueOf(100);
 * Integer b = Integer.valueOf(100);
 * System.out.println(a == b)
 * }
 * <p>
 * valueOf()方法的实现原理
 * <p>
 * public static Integer valueOf(int i) {
 * if (i >= IntegerCache.low && i <= IntegerCache.high) {   // 判定是否在缓存的数组里，如果在，直接取数组里相应的对象返回
 * return IntegerCache.cache[i + (-IntegerCache.low)];
 * }
 * return new Integer(i);     // 如果不存在则新建一个Integer对象返回
 * }
 */

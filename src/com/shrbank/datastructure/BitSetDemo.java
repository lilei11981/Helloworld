package com.shrbank.datastructure;

/**
 * Created by lilei on 2017/7/3.
 * 一个Bitset类创建一种特殊类型的数组来保存位置。
 * BitSet中数组大小会随需要增加。
 * 这和位向量比较类似。
 * 这是一个传统的类，但在Java2中被完全重新设计
 * BitSet定义了两个构造方法
 * 第一个构造方法创建一个默认的对象
 * BitSet()
 * 第二个方法允许用户指定初始大小。所有位初始化为0。
 * BitSet(int size)
 *
 */

import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        // set some bits
        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0) bits1.set(i);
            if ((i % 5) == 0) bits2.set(i);
        }

        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bits2);

        // AND bits
        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1: ");
        System.out.println(bits2);

        // OR bits
        bits2.and(bits1);
        System.out.println("\nbits2 OR bits1: ");
        System.out.println(bits2);

        // XOR bits
        bits2.xor(bits1);
        System.out.println("\nbits2 XOR bits1: ");
        System.out.println(bits2);
    }
}

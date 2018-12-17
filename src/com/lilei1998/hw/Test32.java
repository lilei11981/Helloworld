package com.lilei1998.hw;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-12-14
 * Time: 11:35 AM
 * Description:
 * 输入字符串长度，字符串，计数m。从前往后计数，当数到m个元素时，m个元素出列，同时将该元素赋值给m，
 * 然后从下一个数计数循环，直到所有数字都出列，给定的数全部为大于0的数字。输出出队队列。
 * 输入：len=4    str="3,1,2,4"   m=7
 * 输出：2,3,1,4
 * 思路：最简单的约瑟夫环，数组实现！
 * 出局的数放在新数组，把该数置为新的m;并把该出局的数置为-1，i++并把j又从1开始；每次都整个遍历原数组，遇到-1时i加而j不加。
 */

public class Test32 {
    public static void main(String[] args) {
        System.out.println();
    }
}

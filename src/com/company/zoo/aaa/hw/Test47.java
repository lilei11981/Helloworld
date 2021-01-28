package com.company.zoo.aaa.hw;

/**
 * @author lilei
 * @date 2021-01-28 下午6:04
 * @apiNote 基于数组的动态扩容的栈结构
 */

public class Test47 {

    private String[] data;
    private int head;
    private int count;

    public Test47(int size) {
        data = new String[size];
        head = 0;
        count = 0;
    }

    public static void main(String[] args) {
        Test47 test47 = new Test47(1);
        System.out.println(test47.push("1"));
        System.out.println(test47.push("2"));
        System.out.println(test47.push("3"));
        System.out.println(test47.push("4"));
        System.out.println(test47.push("5"));
        System.out.println(test47.pop());
        System.out.println(test47.pop());
        System.out.println(test47.pop());
        System.out.println(test47.pop());
        System.out.println(test47.pop());
        System.out.println(test47.pop());
        System.out.println(test47.pop());
    }

    public boolean push(String s) {
        if (count == data.length) {
            String[] oldData = data;
            data = new String[oldData.length * 2];
            if (oldData.length >= 0) {
                System.arraycopy(oldData, 0, data, 0, oldData.length);
            }
            data[++head] = s;
        } else if (count == 0) {
            data[head] = s;
        } else {
            data[++head] = s;
        }
        count++;
        return true;
    }

    public String pop() {
        if (count == 0) {
            return null;
        } else {
            String s = data[head--];
            count--;
            return s;
        }
    }
}

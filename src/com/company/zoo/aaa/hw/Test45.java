package com.company.zoo.aaa.hw;

/**
 * @author lilei
 * @date 2021-01-28 下午3:46
 * @apiNote 基于数组实现栈
 */

public class Test45 {
    private String[] data;
    private int head;
    private int count;

    public Test45(int size) {
        data = new String[size];
        head = 0;
        count = 0;
    }

    public static void main(String[] args) {
        Test45 test45 = new Test45(3);
        System.out.println(test45.push("1"));
        System.out.println(test45.push("2"));
        System.out.println(test45.push("3"));
        System.out.println(test45.push("4"));

        System.out.println(test45.pop());
        System.out.println(test45.pop());
        System.out.println(test45.pop());
        System.out.println(test45.pop());
    }

    public boolean push(String s) {
        if (count == data.length) {
            return false;
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

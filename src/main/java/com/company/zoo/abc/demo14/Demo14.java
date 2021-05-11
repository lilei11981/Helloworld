package com.company.zoo.abc.demo14;

/**
 * @author lilei
 * @date 2020-08-04 16:27
 * @apiNote
 */

public class Demo14<T> {

    private T t;

    public static void main(String[] args) {
        Demo14 a = new Demo14<>();
        Object t = a.getT();
        System.out.println(t);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

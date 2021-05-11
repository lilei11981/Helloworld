package com.company.zoo.abc.demo16;

/**
 * @author lilei
 * @date 2020-08-13 10:41
 * @apiNote
 */

public class Apple {
//    int i = 0;
//
//    public static void main(String[] args) {
//        Apple apple = new Apple();
//        apple.eatApple().eatApple().eatApple();
//    }
//
//    Apple eatApple() {
//        i++;
//        System.out.println(i);
//        return this;
//    }

//    private int num;
//
//    public Apple(int num) {
//        this.num = num;
//    }
//
//    public int getNum() {
//        return num;
//    }
//
//    public static void main(String[] args) {
//        Apple apple = new Apple(10);
//        System.out.println(apple.getNum());
//    }

    private int num;
    private String color;

    public Apple() {
        System.out.println("父类方法初始化");
    }

    public Apple(int num) {
        this(num, "􏱚􏱛");
    }

    public Apple(String color) {
        this(1, color);
    }

    public Apple(int num, String color) {
        this.num = num;
        this.color = color;
    }

    public static void main(String[] args) {
        Apple apple = new Apple(12, "red");
        System.out.println(apple.toString());

        Apple apple1 = new Apple(10);
        System.out.println(apple1.toString());

        Apple apple2 = new Apple("green");
        System.out.println(apple2.toString());
    }

    @Override
    public String toString() {
        return "Apple{" +
                "num=" + num +
                ", color='" + color + '\'' +
                '}';
    }
}

package com.company.innerclass.type;

/**
 * @author lilei
 * @date 2020-08-13 15:44
 * @apiNote 二、局部内部类
 * 还有一种内部类，它是定义在方法内部的，作用域只限于本方法，称为局部内部类。
 * 局部内部类的的使用主要是用来解决比较复杂的问题，想创建一个类来辅助我们的解决方案，
 * 到那时又不希望这个类是公共可用的，所以就产生了局部内部类。
 * 局部内部类和成员内部类一样被编译，只是它的作用域发生了改变，
 * 它只能在该方法中被使用，出了该方法就会失效。
 * 局部内部类在实际开发中应用很少。
 */

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.show();
    }

    public void show() {
        //作用域仅限于该方法
        class Inner {
            public void fun() {
                System.out.println("局部内部类使用");
            }
        }
        new Inner().fun();
    }
}

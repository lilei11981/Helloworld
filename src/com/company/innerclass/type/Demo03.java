package com.company.innerclass.type;

/**
 * @author lilei
 * @date 2020-08-13 15:40
 * @apiNote 二、匿名内部类
 * 匿名内部类使用要点
 * 1）匿名内部类没有访问修饰符
 * 2）匿名内部类没有构造方法，因为它连名字都没有哪来的构造器
 */

public class Demo03 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("使用匿名内部类的方式实现Runnable接口");
            }
        }).start();
    }
}

package com.company.zoo.abc.demo02;

import java.util.stream.Stream;

/**
 * @author lilei
 * @date 2020-05-27 15:49
 * @apiNote
 */

public class OuterClass {
    public static String b = "2";
    private static String a = "1";
    private float f = 1.0f;

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.func());
        Stream stream;
    }

    private void make() {
        System.out.println("1");
        System.out.println(a);
    }

    //插入代码到这里
    // 内部类不能有静态方法
    class InnerClass {
        public float func() {
            OuterClass.this.make();
            this.make();
            System.out.println(a);
            return OuterClass.this.f;
        }

        public void make() {
            System.out.println(2);
        }
    }


    // 抽象方法不能有方法体
//    abstract class InnerClass{
//        public abstract float func(){}
//    }
    // 静态方法不能引用非静态变量
//    static class InnerClass{
//        protected static float func(){return f;}
//    }

//    public class InnerClass{
//        static float func(){return f;}
//    }
}

class LocalInnerClass {

    public LocalInnerClass() {
        System.out.println("1");
    }

    private static void function() {
        System.out.println(OuterClass.b);
    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        function();
    }
}

package com.company.zoo.abc.demo16;

/**
 * @author lilei
 * @date 2020-08-13 13:01
 * @apiNote
 */

public class LifeCycle extends Apple {

    // 􏾌􏾍􏻤􏻥静态属性
    private static String staticField = getStaticField();

    // 􏾌􏾍􏻧􏻄􏳉静态方法块
    static {
        System.out.println(staticField);
    }

    // 􏳊􏿩􏻤􏻥普通属性
    private String field = getField();

    // 普通方法块
    {
        System.out.println(field);
    }

    // 􏻨􏻩􏰷􏻅构造方法
    public LifeCycle() {
        System.out.println("􏻨􏻩􏰷􏻅􏻭􏻮􏻯构造方法初始化");
    }

    public static String getStaticField() {
        System.out.println("静态属性初始化");
        return "静态方法块􏻮􏻯初始化";
    }

    public static String getField() {
        System.out.println("普通属性初始化");
        return "普通方法块初始化";
    }

    public static void main(String[] argc) {
        new LifeCycle();
    }
}

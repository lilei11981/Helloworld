package com.shrbank.function;

/**
 * Created by lilei on 2017/7/25 上午10:18.
 * 在重载方法中使用可变参数
 */
public class UsageOfVarargsInOverloading {
    static void varargsTest(int ... number) {
        System.out.print("varargsTest(int ...) 参数个数：" + number.length + " 内容：");
        for (int num : number) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void varargsTest(boolean ... booleans) {
        System.out.print("varargsTest(boolean ...) 参数个数：" + booleans.length + " 内容：");
        for (boolean booleanValue : booleans) {
            System.out.print(booleanValue + " ");
        }
        System.out.println();
    }

    static void varargsTest(String message, int ... number) {
        System.out.print("varargsTest(String, int ...) " + message + " 参数个数：" + number.length + " 内容：");
        for (int num : number) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        varargsTest(1, 2, 3, 4, 5, 6, 7, 8, 9);
        varargsTest(true, true, true, false, false, true, false);
        varargsTest("测试：",10, 20, 30, 40);
    }
}

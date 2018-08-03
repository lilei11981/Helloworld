package com.lilei1998.function;

/**
 * Created by lilei on 2017/7/25 上午9:29.
 * for 语句比较简单，用于循环数据。
 * for 换换执行的次数实在执行前就确定的。语法格式如下：
 * for(初始化;布尔表达式;更新) {
 * // 代码语句
 * }
 * <p>
 * foreach 语句是java5的新特征之一，在遍历数组、集合方面，foreach为开发人员提供了极大的方便
 * foreach 语法格式如下：
 * for(元素类型 元素变量 : 遍历对象) {
 * // 代码语句
 * }
 */
public class UsageOfForAndForeach {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        forDisplay(intArray);
        foreachDisplay(intArray);
    }

    private static void forDisplay(int[] number) {
        System.out.println("使用 for 循环语句");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "  ");
        }
        System.out.println();
    }

    private static void foreachDisplay(int[] data) {
        System.out.println("使用 foreach 循环语句");
        for (int figure : data) {
            System.out.print(figure + "  ");
        }
    }
}

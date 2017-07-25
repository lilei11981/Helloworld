package com.shrbank.array;

/**
 * Created by lilei on 2017/7/25 下午5:50.
 * 使用数组的length属性来获取数组的长度
 */
public class LengthOf2DArray {
    public static void main(String[] args) {
        String[][] data = new String[2][5];
        System.out.println("第一维数组长度：" + data.length);
        System.out.println("第二维数组长度：" + data[0].length);
    }
}

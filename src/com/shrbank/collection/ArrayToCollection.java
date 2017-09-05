package com.shrbank.collection;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lilei on 2017/7/11.
 * 使用Array.asList(name)方法将数组转换为集合
 */
public class ArrayToCollection {
    public static void main(String[] args) throws IOException{
        String[] name = new String[5];    // 声明一个字符串类型的数组变量name，长度为5
        for (int i = 0; i < name.length; i++) {
            name[i] = String.valueOf(i);   // 给数组的每一项赋值
        }

        List<String> list = Arrays.asList(name);    // 实例化List对象，将数组转换为集合
        for (String li : list) {          // 输出集合中的每一项
            System.out.print(li + " ");
        }
    }
}

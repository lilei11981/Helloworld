package com.shrbank.array;

/**
 * Created by lilei on 2017/9/1 下午5:07.
 */
public class ArrayExtend {
    public static void main(String[] args) {
        String[] names = new String[] {"A", "B", "C"};
        String[] extended = new String[5];
        extended[3] = "D";
        extended[4] = "E";
        System.arraycopy(names, 0, extended, 0, names.length);
        for (String string : extended){
            System.out.println(string);
        }
    }
}

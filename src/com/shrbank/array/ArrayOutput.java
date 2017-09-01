package com.shrbank.array;

/**
 * Created by lilei on 2017/9/1 下午4:33.
 */
public class ArrayOutput {
    public static void main(String[] args) {
        String[] winterfell = new String[3];
        winterfell[0] = "Sansa";
        winterfell[1] = "Arya";
        winterfell[2] = "Bran";
        for (int i = 0; i < winterfell.length; i++) {
            System.out.println(winterfell[i]);
        }
    }
}

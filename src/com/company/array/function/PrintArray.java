package com.company.array.function;

/**
 * Created by lilei on 2017/7/11.
 * 通过重载printArray()方法输出不同类型（整型、双精度、字符型）的数组
 */
public class PrintArray {
    public static void printArray(Integer[] inputArray) {
        for (Integer element : inputArray) {
            System.out.printf("%s", element);
            System.out.println();
        }
    }

    public static void printArray(Double[] inputArray) {
        for (Double element : inputArray) {
            System.out.printf("%s", element);
            System.out.println();
        }
    }

    public static void printArray(Character[] inputArray) {
        for (Character element : inputArray) {
            System.out.printf("%s", element);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
        System.out.println("输出整型数组：");
        printArray(integerArray);
        System.out.println("\n输出双精度型数组：");
        printArray(doubleArray);
        System.out.println("\n输出字符型数组：");
        printArray(characterArray);
    }
}

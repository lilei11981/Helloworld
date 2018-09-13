package com.lilei1998.hw;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-09-12
 * Time: 下午2:24
 * Description:
 * 出差遇到大雾
 * <p>
 * 输入描述：
 * 输入出差城市X（X可以为1、2、3、4、6）
 * 输入大雾城市Y（Y可以为0、1、2、3、4、5、6，为0时代表没有城市出现大雾）
 * <p>
 * 输出描述：
 * 输出最短的飞行时间（不可达时为1000）
 * 输出飞行路径，使用"[]"包围所有的值，使用","分割数值，不可达时为"[]"
 * <p>
 * 输入例子：
 * 2
 * 4
 * <p>
 * 输出例子：
 * 6
 * [5,1,2]
 */

public class Test08 {
    // 定义不可达的距离为1000
    private final static int INFINITY = 1000;
    // 两个数组，一个用来储存任意两个城市的最短距离，一个用来储存路径
    private static int[][] distance;
    private static int[][] path;

    public static void main(String[] args) {
        int beginCity = 5 - 1;
        int size = 6;
        Scanner scanner = new Scanner(System.in);
        int endCity = scanner.nextInt() - 1;
        int foggyCity = scanner.nextInt() - 1;

        // 初始化矩阵，表示两个城市的距离
        int[][] matrix = {{0, 2, 10, 5, 3, INFINITY},
                {INFINITY, 0, 12, INFINITY, INFINITY, 10},
                {INFINITY, INFINITY, 0, INFINITY, 7, INFINITY},
                {2, INFINITY, INFINITY, 0, 2, INFINITY},
                {4, INFINITY, INFINITY, 1, 0, INFINITY},
                {3, INFINITY, 1, INFINITY, 2, 0}
        };

        // 初始化数组
        distance = new int[size][size];
        path = new int[size][size];

        // 设置起雾城市
        if (foggyCity != 0) {
            setFoggyCity(foggyCity, matrix);
        }

        // 使用floyd算法
        floyd(matrix);

        // 距离
        System.out.println(distance[beginCity][endCity]);

        // 路径
        ArrayList<Integer> pathList = new ArrayList<>();
        findPath(beginCity, endCity, pathList);

        // 路径每个值加1
        for (int i = 0; i < pathList.size(); i++) {
            pathList.set(i, pathList.get(i) + 1);
        }
        if (distance[beginCity][endCity] == INFINITY) {
            pathList.removeAll(pathList);
        }
        System.out.println(pathList);
    }

    public static void setFoggyCity(int foggyCity, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[foggyCity][i] = INFINITY;
            matrix[i][foggyCity] = INFINITY;
        }
    }

    public static void floyd(int[][] matrix) {
        int size = matrix.length;

        // 为辅助数组赋值
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                distance[i][j] = matrix[i][j];
                path[i][j] = -1;
            }
        }

        // floyd算法
        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (distance[i][j] > distance[i][k] + distance[k][j]) {
                        distance[i][j] = distance[i][k] + distance[k][j];
                        path[i][j] = k;
                    }
                }
            }
        }
    }

    public static void findPath(int beginCity, int endCity, ArrayList<Integer> pathList) {
        pathList.add(beginCity);
        while (path[beginCity][endCity] != -1) {
            int midCity = path[beginCity][endCity];
            pathList.add(midCity);
            beginCity = midCity;
        }
        pathList.add(endCity);
    }
}

package com.company.lambda.lambda03;

/**
 * @author lilei
 * @date 2020-07-04 12:53
 * @apiNote
 */

public class Demo03 {

    public static void main(String[] args) {
        invoke(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        invoke(100, 200, (int a, int b) -> {
            return a + b;
        });

        invoke(100, 200, (a, b) -> a + b);
    }

    public static void invoke(int a, int b, Calculator calculator) {
        int sum = calculator.calc(a, b);
        System.out.println(sum);
    }
}

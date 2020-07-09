package com.company.lambda.lambda01;

/**
 * @author lilei
 * @date 2020-07-04 12:28
 * @apiNote
 */

public class Demo01 {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void cook() {
                System.out.println("吃饭了");
            }
        });
        System.out.println("===============");

        invokeCook(() -> System.out.println("吃饭了"));
    }

    public static void invokeCook(Cook cook) {
        cook.cook();
    }
}

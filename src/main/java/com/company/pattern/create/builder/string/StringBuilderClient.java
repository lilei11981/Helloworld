package com.company.pattern.create.builder.string;

/**
 * @author lilei
 * @date 2021-05-05 下午6:05
 * @apiNote
 */

public class StringBuilderClient {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("我们").append("是").append("共产主义").append("接班人");
        String result = builder.toString();
        System.out.println(result);
    }
}

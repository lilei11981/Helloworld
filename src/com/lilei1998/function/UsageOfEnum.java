package com.lilei1998.function;

/**
 * Created by lilei on 2017/7/24 下午5:37.
 * 以下实例演示了Enum（枚举）构造函数及方法的使用
 */

enum Cars {                 //  枚举类型相当于类，不可与同一包中的其它类相同
    Lamborghini(900), Tata(2), Audi(50), Fiat(15), Honda(12);
    private int price;

    Cars(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}

public class UsageOfEnum {
    public static void main(String[] args) {
        System.out.println("所有汽车的价格：");
        for (Cars car : Cars.values()) {
            System.out.println(car + " 需要 " + car.getPrice() + " 千美元！");
        }
    }
}

package com.lilei1998.function;

/**
 * Created by lilei on 2017/7/24 下午5:24.
 * Java 创建枚举类型要使用enum关键字，隐藏了所创建的类型都是java.lang.Enum类的子类
 * 对enum进行遍历和switch操作示例代码
 */

enum Car {
    Lamborghini, Tata, Audi, Fiat, Honda
}

public class UsageOfEnumAndSwitch {
    public static void main(String[] args) {
        Car car;
        car = Car.Tata;
        switch (car) {
            case Lamborghini: {
                System.out.println("你选择了 Lamborghini!");
                break;
            }
            case Tata: {
                System.out.println("你选择了 Tata!");
                break;
            }
            case Audi: {
                System.out.println("你选择了 Audi!");
                break;
            }
            case Fiat: {
                System.out.println("你选择了 Fiat!");
                break;
            }
            case Honda: {
                System.out.println("你选择了 Honda!");
                break;
            }
            default: {
                System.out.println("我不知道你的车型");
                break;
            }
        }
    }
}

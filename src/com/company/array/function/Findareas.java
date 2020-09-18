package com.company.array.function;

/**
 * Created by lilei on 2017/7/21 下午4:14.
 * 方法覆盖
 * 方法重载（Overloading）：如果有两个方法的方法名相同，但参数不一致，那么可以说一个方法是另一个方法的重载
 * 方法覆盖（Overriding）： 如果在子类中定义一个方法，其名称、返回类型及参数签名正好与父类中某个方法的名称、
 * 返回类型及参数签名相匹配，那么可以说，子类的方法覆盖了父类的方法
 */

public class Findareas {
    public static void main(String[] args) {
        Figure figure = new Figure(10, 10);
        Rectangle rectangle = new Rectangle(9, 5);
        Figure findareas;
        findareas = figure;
        System.out.println("Area is : " + findareas.area());
        findareas = rectangle;
        System.out.println("Area is : " + findareas.area());
    }
}

class Figure {
    double num1;
    double num2;

    Figure(double a, double b) {
        num1 = a;
        num2 = b;
    }

    Double area() {
        System.out.println("Inside area for figure.");
        return (num1 * num2);
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    Double area() {
        System.out.println("Inside area for rectangle.");
        return (num1 * num2);
    }
}

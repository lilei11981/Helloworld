package com.company.innerclass.memberinnerclass;

/**
 * @author lilei
 * @date 2020-06-14 13:03
 * @apiNote
 */

class Circle {

    double radius = 0;
    private int a = 1;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(0.1);
        Circle.Draw draw = circle.new Draw();
        draw.drawShape();
        System.out.println(draw.transferInt());
    }

    //内部类
    class Draw {

        private int a = 2;

        public void drawShape() {
            System.out.println(this.a);
            System.out.println(this.transferInt());
            System.out.println(this.toString());
            System.out.println(radius);
            System.out.println(a);
            System.out.println("draw shape");
        }

        public int transferInt() {
            System.out.println(this.transferInt());
            return Circle.this.a;
        }
    }
}
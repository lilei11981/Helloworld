package com.company.algorithm.hw;

/**
 * @author lilei
 * @date 2021/2/1 10:51 下午
 * @apiNote 求一个数的立方根
 */

public class Test60 {

    public static double getCubeRoot(double input) {
        double output = 0d;
        for (output = 0; output < input; output += 0.1) {
            double a = output * output * output - input;
            double b = ((output + 0.1) * (output + 0.1) * (output + 0.1)) - input;
            if (a == 0) {
                return output;
            } else if (b == 0) {
                return output + 0.1;
            } else if (a < 0 && b > 0) {
                if (b > -a) {
                    return output;
                } else {
                    return output + 0.1;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.printf("%.1f", getCubeRoot(120));
    }
}

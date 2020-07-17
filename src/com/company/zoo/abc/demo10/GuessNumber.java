package com.company.zoo.abc.demo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * @author lilei
 * @date 2020-06-29 22:07
 * @apiNote
 */
// 50
// 25
// 2*2*2*2*2*2*2*2=128


public class GuessNumber {
    private static final int MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(MAX);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int count = 0;
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            count++;
            System.out.println("猜数字次数" + count);
            if (a < number) {
                arrayList1.add(a);
                if (arrayList2.size() == 0) {
                    System.out.println("数字大于" + a + "小于" + MAX);
                } else {
                    System.out.println("数字大于" + a + "小于" + Collections.min(arrayList2));
                }
            } else if (a > number) {
                arrayList2.add(a);
                if (arrayList1.size() == 0) {
                    if (Collections.min(arrayList2) < MAX) {
                        System.out.println("数字大于" + 0 + "小于" + Collections.min(arrayList2));
                    } else if (a > MAX) {
                        System.out.println("数字大于" + 0 + "小于" + MAX);
                    } else {
                        System.out.println("数字大于0小于" + a);
                    }
                } else if (a > MAX) {
                    if (Collections.min(arrayList2) < MAX) {
                        System.out.println("数字大于" + Collections.max(arrayList1) + "小于" + Collections.min(arrayList2));
                    } else {
                        System.out.println("数字大于" + Collections.max(arrayList1) + "小于" + MAX);
                    }
                } else {
                    System.out.println("数字大于" + Collections.max(arrayList1) + "小于" + a);
                }
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}

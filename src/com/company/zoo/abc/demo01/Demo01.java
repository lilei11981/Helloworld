package com.company.zoo.abc.demo01;

import java.util.ArrayList;

/**
 * @author lilei
 * @date 2020-06-28 11:04
 * @apiNote
 */

public class Demo01 {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setName("老板");
        boss.setBalance(100);

        Employee employeeA = new Employee();
        employeeA.setName("A");
        employeeA.setBalance(0);
        Employee employeeB = new Employee();
        employeeB.setName("B");
        employeeB.setBalance(0);
        Employee employeeC = new Employee();
        employeeC.setName("C");
        employeeC.setBalance(0);

        ArrayList<Integer> list = boss.send(50, 3);
        employeeA.receive(list);
        employeeB.receive(list);
        employeeC.receive(list);

        System.out.println(employeeA.toString());
        System.out.println(employeeB.toString());
        System.out.println(employeeC.toString());
        System.out.println(boss.toString());


    }
}

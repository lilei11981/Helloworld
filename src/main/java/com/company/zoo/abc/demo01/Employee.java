package com.company.zoo.abc.demo01;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lilei
 * @date 2020-06-28 10:48
 * @apiNote
 */

public class Employee extends Person {

    public void receive(ArrayList<Integer> moneyList) {
        Random random = new Random();
        int count = random.nextInt(moneyList.size());
        int money = moneyList.remove(count);
        this.setBalance(this.getBalance() + money);
    }
}

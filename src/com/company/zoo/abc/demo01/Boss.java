package com.company.zoo.abc.demo01;

import java.util.ArrayList;

/**
 * @author lilei
 * @date 2020-06-28 10:48
 * @apiNote
 */

public class Boss extends Person {

    public ArrayList<Integer> send(int moneyNum, int count) {

        ArrayList<Integer> moneyList = new ArrayList<>();

        int avg = moneyNum / count;
        int mod = moneyNum % count;
        for (int i = 0; i < count - 1; i++) {
            moneyList.add(avg);
        }
        moneyList.add(avg + mod);

        this.setBalance(this.getBalance() - moneyNum);
        return moneyList;
    }


}

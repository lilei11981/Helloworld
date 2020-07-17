package com.company.zoo.abc.demo10;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author lilei
 * @date 2020-06-29 09:48
 * @apiNote
 */

public class Demo10 {

    public static void main(String[] args) {
        ArrayList<String> allCards = new ArrayList<>(54);
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                allCards.add(getNum(j) + getColor(i));
            }
        }
        allCards.add("大王");
        allCards.add("小王");
        Collections.shuffle(allCards);

        ArrayList<String> player0 = new ArrayList<>(17);
        ArrayList<String> player1 = new ArrayList<>(17);
        ArrayList<String> player2 = new ArrayList<>(17);
        ArrayList<String> bottom = new ArrayList<>(3);

        for (int i = 0; i < allCards.size(); i++) {
            if (i < allCards.size() - 3) {
                switch (i % 3) {
                    case 0:
                        player0.add(allCards.get(i));
                        break;
                    case 1:
                        player1.add(allCards.get(i));
                        break;
                    case 2:
                    default:
                        player2.add(allCards.get(i));
                        break;
                }
            } else {
                bottom.add(allCards.get(i));
            }
        }
        Collections.sort(player0);
        Collections.sort(player1);
        Collections.sort(player2);

        System.out.println(player0.size() + "张牌" + player0);
        System.out.println(player1.size() + "张牌" + player1);
        System.out.println(player2.size() + "张牌" + player2);

        System.out.println(bottom);

    }

    public static String getColor(int a) {
        switch (a) {
            case 0:
                return "红桃";
            case 1:
                return "黑桃";
            case 2:
                return "梅花";
            default:
                return "方片";
        }
    }

    public static String getNum(int a) {
        switch (a) {
            case 13:
                return "K";
            case 12:
                return "Q";
            case 11:
                return "J";
            case 1:
                return "A";
            default:
                return a + "";
        }
    }
}

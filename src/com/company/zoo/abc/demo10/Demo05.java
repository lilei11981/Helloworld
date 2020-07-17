package com.company.zoo.abc.demo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author lilei
 * @date 2020-06-30 21:48
 * @apiNote
 */

public class Demo05 {
    public static void main(String[] args) {
        // 1.准备牌
        ArrayList<String> colors = new ArrayList<>(4);
        colors.add("♠");
        colors.add("♥");
        colors.add("♣");
        colors.add("♦");
        ArrayList<String> numbers = new ArrayList<>(13);
        numbers.add("2");
        numbers.add("A");
        numbers.add("K");
        numbers.add("Q");
        numbers.add("J");
        for (int i = 10; i >= 3; i--) {
            numbers.add(i + "");
        }
        ArrayList<String> pokers = new ArrayList<>(54);
        pokers.add("大王");
        pokers.add("小王");
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                pokers.add(colors.get(j) + numbers.get(i));
            }
        }
        HashMap<Integer, String> map = new HashMap<>(54);
        for (int i = 0; i < 54; i++) {
            map.put(i, pokers.get(i));
        }
        // 洗牌
        Set<Integer> set = map.keySet();
        ArrayList<Integer> order = new ArrayList<>(set);
        Collections.shuffle(order);
        // 发牌
        HashMap<Integer, String> bottomPoker = new HashMap<>(3);
        HashMap<Integer, String> player1 = new HashMap<>(17);
        HashMap<Integer, String> player2 = new HashMap<>(17);
        HashMap<Integer, String> player3 = new HashMap<>(17);
        for (int i = 0; i < 54; i++) {
            int num = order.get(i);
            String poker = map.get(num);
            if (i >= 51) {
                bottomPoker.put(num, poker);
            } else if (i % 3 == 0) {
                player1.put(num, poker);
            } else if (i % 3 == 1) {
                player2.put(num, poker);
            } else {
                player3.put(num, poker);
            }
        }
        // 看牌
        lookPoker(player1);
        lookPoker(player2);
        lookPoker(player3);
        lookPoker(bottomPoker);
    }

    private static void lookPoker(HashMap<Integer, String> player) {
        List<Map.Entry<Integer, String>> list = new ArrayList<>(player.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey() - o2.getKey();
            }
        });
        for (Map.Entry<Integer, String> integerStringEntry : list) {
            System.out.print(integerStringEntry.getValue() + " ");
        }
        System.out.println();
    }


}

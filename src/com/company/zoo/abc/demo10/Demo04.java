package com.company.zoo.abc.demo10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lilei
 * @date 2020-06-30 21:18
 * @apiNote
 */

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String inputString = scanner.next();
            char[] chars = inputString.toCharArray();
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for (char c : chars) {
                if (hashMap.containsKey(c)) {
                    int count = hashMap.get(c);
                    count++;
                    hashMap.put(c, count);
                } else {
                    int count = 1;
                    hashMap.put(c, count);
                }
            }
            Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();
            for (Map.Entry<Character, Integer> entry : entries) {
                System.out.println(entry.getKey() + "-->" + entry.getValue());
            }
        }
    }
}

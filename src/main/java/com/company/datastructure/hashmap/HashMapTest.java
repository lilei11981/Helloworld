package com.company.datastructure.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author lilei
 * @date 2020-06-17 10:08
 * @apiNote
 */

public class HashMapTest {
    static HashMap wordsMap = new HashMap();

    public static void main(String[] args) {
        MyCardTable myCardTable1 = new MyCardTable(1L, "中国银行", "620019", 16);
        MyCardTable myCardTable2 = new MyCardTable(2L, "招商银行", "622581", 16);
        MyCardTable myCardTable3 = new MyCardTable(3L, "招商银行", "622520", 19);
        MyCardTable myCardTable4 = new MyCardTable(4L, "招商银行", "622520", 17);
        List<MyCardTable> list = new ArrayList<>();
        list.add(myCardTable1);
        list.add(myCardTable2);
        list.add(myCardTable3);
        list.add(myCardTable4);
        addWordsToHashMap(list);
        String cardNo1 = "62001912345678902";
        String cardNo2 = "6225201234567812345";
        System.out.println(checkWords(cardNo1));
        System.out.println(checkWords(cardNo2));
    }

    // 构造字典树
    private static void addWordsToHashMap(List<MyCardTable> list) {
        String head = null;
        Integer length = null;
        MyCardTable cardTable = null;
        Map childMap = null;
        Map<String, Object> newWordMap = null;
        Iterator<MyCardTable> iterator = list.iterator();
        while (iterator.hasNext()) {
            cardTable = iterator.next();
            head = cardTable.getHead();
            length = cardTable.getLength();

            Object lengthMap = wordsMap.computeIfAbsent(length, k -> new HashMap<>());
            childMap = (Map) lengthMap;

            for (int i = 0; i < head.length(); i++) {
                char key = head.charAt(i);
                Object wordMap = childMap.get(key);
                if (wordMap != null) {
                    childMap = (Map) wordMap;
                } else {
                    newWordMap = new HashMap<>();
                    newWordMap.put("isEnd", null);
                    childMap.put(key, newWordMap);
                    childMap = newWordMap;
                }

                if (i == head.length() - 1) {
                    childMap.put("isEnd", cardTable);
                }
            }
        }
    }

    private static String checkWords(String cardNo) {
        MyCardTable myCardTable = null;
        char word;
        int length = cardNo.length();
        Map childMap = (Map) wordsMap.get(length);
        if (childMap == null) {
            return "长度不存在";
        }

        for (int i = 0; i < length; i++) {
            word = cardNo.charAt(i);
            childMap = (Map) childMap.get(word);
            if (childMap == null) {
                break;
            } else {
                if (null != childMap.get("isEnd")) {
                    myCardTable = (MyCardTable) childMap.get("isEnd");
                }
            }
        }
        return myCardTable == null ? "没有数据" : myCardTable.getBank();
    }
}

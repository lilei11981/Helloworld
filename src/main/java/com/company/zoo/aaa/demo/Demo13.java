package com.company.zoo.aaa.demo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author lilei
 * @date 2020-07-13 14:00
 * @apiNote
 */

public class Demo13 {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int[] array = {1, 2, 2, 4, 3};
        System.out.println(getNum(n, k, array));
        System.out.println(getResult(n, k, array));
    }

    private static long getResult(int n, int k, int[] array) {
        ArrayList<HashMap<Integer, ArrayList<Integer>>> list = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(array[0]);
        map.put(1, integers);
        map.put(2, new ArrayList<>());
        map.put(3, new ArrayList<>());
        list.add(map);
        for (int i = 1; i < n; i++) {
            System.out.println(list);
            HashMap<Integer, ArrayList<Integer>> newMap = new HashMap<>();
            ArrayList<Integer> arrayList1 = new ArrayList<>(list.get(i - 1).get(1));
            arrayList1.add(array[i]);
            newMap.put(1, arrayList1);
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            if (list.get(i - 1).get(2) != null) {
                arrayList2.addAll(list.get(i - 1).get(2));
            }
            for (Integer integer : list.get(i - 1).get(1)) {
                if (array[i] == integer * k) {
                    arrayList2.add(array[i]);
                    newMap.put(2, arrayList2);
                }
            }
            ArrayList<Integer> arrayList3 = new ArrayList<>();
            if (list.get(i - 1).get(3) != null) {
                arrayList3.addAll(list.get(i - 1).get(3));
            }
            if (list.get(i - 1).get(2) != null) {
                for (Integer integer : list.get(i - 1).get(2)) {
                    if (array[i] == integer * k) {
                        arrayList3.add(array[i]);
                        newMap.put(3, arrayList3);
                    }
                }
            }
            list.add(newMap);
        }
        System.out.println(list);
        if (list.get(n - 1).get(3) != null) {
            return list.get(n - 1).get(3).size();
        } else {
            return 0;
        }

    }

    private static long getNum(int n, int k, int[] array) {
        long num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    boolean x = array[i] * k == array[j];
                    boolean y = array[j] * k == array[l];
                    boolean z = l > j && j > i;
                    if (x && y && z) {
                        num++;
                    }
                }
            }
        }
        return num;
    }
}

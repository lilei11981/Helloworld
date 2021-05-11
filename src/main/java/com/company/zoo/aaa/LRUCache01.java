package com.company.zoo.aaa;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lilei
 * @date 2021-04-25 下午10:34
 * @apiNote 实现一个LRU淘汰算法
 */

public class LRUCache01 {
    /*容量大小*/
    private int capacity;
    /*维护数据的map*/
    private Map<Integer, Integer> map;

    public LRUCache01(int capacity) {
        this.capacity = capacity;
        // 用LinkedHashMap实现数据数据的维护
        map = new LinkedHashMap<>();
    }

    /*测试案例*/
    public static void main(String[] args) {
        LRUCache01 cache = new LRUCache01(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }

    /**
     * 如果 map 中 不存在key，直接返回-1，如果有key，做一遍删除和添加，然后返回，保证数据在链表的尾部
     * @param key 要查找的key
     * @return 返回value
     */
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Integer value = map.remove(key);
        map.put(key, value);
        return value;
    }

    /**
     * 如果已经存在key，做删除和添加，结束
     * 如果不存在，做添加动作，如果map的size大于规定容量，则从头部移除一条key
     * @param key 待加入的key
     * @param value 待加入的value
     */
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.remove(key);
            map.put(key, value);
            return;
        }
        map.put(key, value);
        if (map.size() > capacity) {
            map.remove(map.entrySet().iterator().next().getKey());
        }
    }
}

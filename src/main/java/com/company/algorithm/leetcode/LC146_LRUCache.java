package com.company.algorithm.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lilei
 * @date 2021-05-15 下午8:33
 * @apiNote 实现一个LRU淘汰算法
 */

//    LRU缓存
//
//    设计和构建一个“最近最少使用”缓存，该缓存会删除最近最少使用的项目。缓存应该从键映射到值(允许你插入和检索特定键对应的值)，并在初始化时指定最大容量。当缓存被填满时，它应该删除最近最少使用的项目。
//
//    它应该支持以下操作： 获取数据 get 和 写入数据 put 。
//
//    获取数据 get(key) - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
//    写入数据 put(key, value) - 如果密钥不存在，则写入其数据值。当缓存容量达到上限时，它应该在写入新数据之前删除最近最少使用的数据值，从而为新的数据值留出空间。
//
//    示例:
//
//    LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );
//
//cache.put(1, 1);
//cache.put(2, 2);
//cache.get(1);       // 返回  1
//cache.put(3, 3);    // 该操作会使得密钥 2 作废
//cache.get(2);       // 返回 -1 (未找到)
//cache.put(4, 4);    // 该操作会使得密钥 1 作废
//cache.get(1);       // 返回 -1 (未找到)
//cache.get(3);       // 返回  3
//cache.get(4);       // 返回  4
//
//==========================================================
//
//    class LRUCache {
//
//        public LRUCache(int capacity) {
//
//        }
//
//        public int get(int key) {
//
//        }
//
//        public void put(int key, int value) {
//
//        }
//    }
//
///**
// * Your LRUCache object will be instantiated and called as such:
// * LRUCache obj = new LRUCache(capacity);
// * int param_1 = obj.get(key);
// * obj.put(key,value);
// */

public class LC146_LRUCache {

    /*容量大小*/
    private int capacity;
    /*维护数据的map*/
    private Map<Integer, Integer> map;

    public LC146_LRUCache(int capacity) {
        this.capacity = capacity;
        // 用LinkedHashMap实现数据数据的维护
        map = new LinkedHashMap<>();
    }

    /*测试案例*/
    public static void main(String[] args) {
        LC146_LRUCache cache = new LC146_LRUCache(2);
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

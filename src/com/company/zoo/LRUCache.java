package com.company.zoo;

/**
 * @author lilei
 * @date 2021-02-05 下午7:36
 * @apiNote
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

//public class LRUCache {

//    private HashMap<Integer, Node> map = new HashMap<>();
//    private Node head = new Node(-1, -1);
//    private Node tail = new Node(-1, -1);


//    public LRUCache(int capacity) {
//
//    }

//    public int get(int key) {
//        if (map.containsKey(key)) {
//            Node node = map.get(key);
//            node.pre.next = node.next;
//            node.next.pre = node.pre;
//
//        }
//        return -1;
//    }

//    public void put(int key, int value) {
//
//    }

//    private int capacity;
//    private Map<Integer, Integer> map = new HashMap<>();
//
//    public LRUCache(int capacity) {
//        this.capacity = capacity;
//    }
//
//    public static void main(String[] args) {
//        Node node = new Node(1, 1);
//        node.next = new Node(2, 2);
//        System.out.println(node);
//        SimpleDateFormat simpleDateFormat;
//    }
//
//    public int get(int key) {
//
//        return -1;
//    }
//
//    public void put(int key, int value) {
//        if (map.size() == capacity) {
//        }
//        map.put(key, value);
//    }

//    private void exchange(Node node) {
//        node.next = head.next;
//        head.next.pre = node;
//        head.next = node;
//        node.pre = head;
//    }
//
//    static class Node {
//        int key;
//        int value;
//        Node pre;
//        Node next;
//
//        public Node(int key, int value) {
//            this.key = key;
//            this.value = value;
//        }
//
//        @Override
//        public String toString() {
//            return "Node{" +
//                    "key=" + key +
//                    ", value=" + value +
//                    ", pre=" + pre +
//                    ", next=" + next +
//                    '}';
//        }
//    }


//}

public class LRUCache {

    int count;
    int pos;
    int size;
    private int[] data = null;
    private int[] cache = null;

    public LRUCache(int capacity) {
        data = new int[(int) Math.round(capacity * 1.5)];
        cache = new int[(int) Math.round(capacity * 1.5)];
        count = capacity;
        pos = 1;
        size = 0;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2 /* 缓存容量 */);

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4
    }

    public int get(int key) {
        int tempKey = key;
        if (data[tempKey] != -1) {
            cache[tempKey] = ++tempKey;
        }

        int tempValue = data[tempKey];
        if (tempValue == 0) {
            tempValue = -1;
        }
        return tempValue;
    }

    public void put(int key, int value) {
        int dataLength = data.length;
        if (key > dataLength - 1) {
            transform(dataLength, key);
        }
        cache[key] = ++pos;
        if (data[key] == 0 || data[key] == -1) {
            ++size;
        }
        if (size > count) {
            evict();
        }
        data[key] = value;
    }

    public void transform(int dataLength, int key) {
        int newKey = (int) Math.round(key * 1.5);
        int[] newData = new int[newKey];
        System.arraycopy(data, 0, newData, 0, dataLength);
        data = newData;
        int[] newCache = new int[newKey];
        System.arraycopy(cache, 0, newCache, 0, dataLength);
        cache = newCache;
    }

    public void evict() {
        int temp = 15000;
        int key = -1;
        int cacheLength = cache.length;
        for (int i = 0; i < cacheLength; i++) {
            int tempCache = cache[i];
            if (tempCache != 0 || data[i] == 0) {
                if (temp > tempCache) {
                    temp = tempCache;
                    key = i;
                }
            }
        }
        data[key] = -1;
        cache[key] = 0;
        size--;
    }


}


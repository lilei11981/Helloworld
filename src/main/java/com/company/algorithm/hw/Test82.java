package com.company.algorithm.hw;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lilei
 * @date 2021/2/4 10:57 下午
 * @apiNote
 * 给定String类型的数组strArr，再给定整数k，请严格按照排名顺序打印 出次数前k名的字符串。
 * [要求]
 * 如果strArr长度为N，时间复杂度请达到O(NlogK)
 * 输出K行，每行有一个字符串和一个整数（字符串表示）。
 * 你需要按照出现出现次数由大到小输出，若出现次数相同时字符串字典序较小的优先输出
 * TopN问题堆排序求解
 * 统计各个字符出现次数，使用Map
 * 创建初始堆(大顶堆)，定义出现次数大的字符串较大，出现次数相同是自然序较前的串较大
 * 依次去K个堆顶元素并调整堆
 */

public class Test82 {
    /**
     * return topK string
     * @param strings string字符串一维数组 strings
     * @param k int整型 the k
     * @return string字符串二维数组
     */
    public String[][] topKStrings (String[] strings, int k) {
        // write code here
        if (strings == null || strings.length == 0) {
            return new String[0][];
        }

        String[][] result = new String[k][];
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        Node[] heap = new Node[map.size() + 1];
        int index = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Node node = this.new Node(entry.getKey(), entry.getValue());
            heap[++index] = node;
        }
        for (int i = index / 2; i > 0; i--) {
            shift(heap, i, heap.length);
        }
        int limit = heap.length - 1;
        for (int i = 1; i <= k && i <= limit; i++) {
            String[] newString = new String[]{heap[1].value, String.valueOf(heap[1].count)};
            result[i - 1] = newString;

            Node temp = heap[1];
            heap[1] = heap[limit];
            heap[limit] = temp;
            --limit;
            shift(heap, 1, limit + 1);
        }
        return result;

    }

    private void shift(Node[] heap, int start, int end) {
        int child = 2 * start;
        if (child + 1 < end && heap[child + 1].compareTo(heap[child]) > 0) {
            child = child + 1;
        }
        if (child < end && heap[child].compareTo(heap[start]) > 0) {
            Node temp = heap[child];
            heap[child] = heap[start];
            heap[start] = temp;
            shift(heap, child, end);
        }
    }

    class Node implements Comparable<Node> {
        String value;
        int count;

        public Node() {

        }

        public Node(String value, int count) {
            this.value = value;
            this.count = count;
        }

        @Override
        public int compareTo(Node node) {
            if (this.count != node.count) {
                return this.count - node.count;
            } else {
                return -this.value.compareTo(node.value);
            }
        }
    }
}

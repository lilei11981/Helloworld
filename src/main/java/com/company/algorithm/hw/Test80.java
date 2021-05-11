package com.company.algorithm.hw;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author lilei
 * @date 2021-02-04 下午5:18
 * @apiNote 给出一组区间，请合并所有重叠的区间。
 */

public class Test80 {


    public static void main(String[] args) {
        // [[10,30],[20,60],[80,100],[150,180]]
        Interval interval1 = new Interval(10, 30);
        Interval interval2 = new Interval(20, 60);
        Interval interval3 = new Interval(80, 100);
        Interval interval4 = new Interval(150, 180);
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(interval1);
        intervals.add(interval3);
        intervals.add(interval2);
        intervals.add(interval4);
        System.out.println(intervals);

        System.out.println(merge(intervals));
    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> result = new ArrayList<>();
        intervals.sort(Comparator.comparingInt(a -> a.start));
        for (int i = 0; i < intervals.size(); i++) {
            int left = intervals.get(i).start;
            int right = intervals.get(i).end;
            while (i < intervals.size() - 1 && intervals.get(i + 1).start <= right) {
                right = Math.max(right, intervals.get(i + 1).end);
                i++;
            }
            result.add(new Interval(left, right));
        }
        return result;
    }


    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
}

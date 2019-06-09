package com.company.array;

/**
 * Created by lilei on 2017/9/1 下午5:07.
 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 * 它可以实现将一个数组的指定个数元素复制到另一个数组中
 * 举例：
 * arrayCopy(arr1, 2, arr2, 5, 10);
 * 将arr1数组里从索引为2的元素开始, 复制到数组arr2里的索引为5的位置, 复制的元素个数为10个.
 */
public class ArrayExtend {
    public static void main(String[] args) {
        String[] names = new String[]{"A", "B", "C"};
        String[] extended = new String[5];
        extended[3] = "D";
        extended[4] = "E";
        System.arraycopy(names, 0, extended, 0, names.length);
        for (String string : extended) {
            System.out.print(string + " ");
        }
    }
}

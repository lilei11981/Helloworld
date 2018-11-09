package com.lilei1998.hw;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-08
 * Time: 5:34 PM
 * Description:
 * 将一个十进制（byte型）转换为二进制，讲二进制数前后颠倒，再算出颠倒后对于的十进制数。
 */

public class Test19 {
    public static void main(String[] args) {
        int number = 10;
        String binary = Integer.toBinaryString(number);
        System.out.println("二进制为：" + binary);
        char[] chars = binary.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuffer.append(chars[i]);
        }
        System.out.println("二进制颠倒后：" + stringBuffer.toString());
        Integer integer = Integer.valueOf(stringBuffer.toString(), 2);
        System.out.println("对应的十进制：" + integer);
    }
}

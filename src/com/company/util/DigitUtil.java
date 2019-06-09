package com.company.util;

/**
 * Created by lilei on 2017/10/24 下午4:01.
 */
public class DigitUtil {
    private static int[] _crossLine = new int[]{9, 99, 999, 9999, 99999, 999999, 9999999, 99999999};
    private static String[] _comp = new String[]{"", "0", "00", "000", "0000", "00000", "000000", "0000000", "00000000"};

    /**
     * 左补零，补齐长度为指定位数的数字，并转换成字节数组返回
     *
     * @param digit    位数
     * @param maxDigit 最大位数
     * @return 字节数组
     * @throws IndexOutOfBoundsException 数组越界异常
     */
    public static byte[] digit2Bytes(int digit, int maxDigit) {
        String s = "";
        int max = maxDigit - 1;  // 数组
        for (int i = 0; i < maxDigit; i++) {  // 遍历
            if (digit <= _crossLine[i]) {  // 如果位数小于位数的最大值
                s = _comp[max - i];    // 赋值给s
                break;
            }
            if (i == maxDigit - 1) {
                throw new IndexOutOfBoundsException("The max digit is "
                        + _comp.length + ", digit-->bytes convert failed!");
            }
        }
        return (s + digit).getBytes();
    }

    /**
     * 左补零，补齐长度为指定位数位的数字，并转换成字符串返回
     *
     * @param digit    位数
     * @param maxDigit 最大位数
     * @return 字节数组
     * @throws IndexOutOfBoundsException 数组越界异常
     */
    public static String digit2String(int digit, int maxDigit) {
        String s = "";
        int max = maxDigit - 1;
        for (int i = 0; i < maxDigit; i++) {
            if (digit <= _crossLine[i]) {
                s = _comp[max - i];
                break;
            }
            if (i == maxDigit - 1) {
                throw new IndexOutOfBoundsException("The max digit is "
                        + _comp.length + ", digit-->bytes convert failed!");
            }
        }
        return (s + digit);
    }

    /**
     * 将字节转换成数字
     *
     * @param bytes 字节
     * @return 数字
     */
    public static int bytes2Digit(byte[] bytes) {
        return Integer.parseInt(new String(bytes));
    }
}

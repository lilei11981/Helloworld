package com.lilei1998.hw;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-09-07
 * Time: 下午4:33
 * Description:
 * 题目描述
 * 输入任意个字符串，将其中的小写字母变为大写，大写字母变为小写，其他字符不用处理；
 * 输入描述:
 * 任意字符串：abcd12#%XYZ
 * 输出描述:
 * 输出字符串：ABCD12#%xyz
 * <p>
 * 示例1：
 * 输入： abcd12#%XYZ
 * 输出： ABCD12#%xyz
 */

public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringScanner = scanner.nextLine();
        String stringUpperCase = stringScanner.toUpperCase();
        char[] chars = stringScanner.toCharArray();
        int diff = 'A' - 'a';
        for (int i = 0; i < chars.length; i++) {
            if ('a' <= chars[i] && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] + diff);
            } else if ('A' <= chars[i] && chars[i] <= 'A') {
                chars[i] = (char) (chars[i] - diff);
            }
        }
        String stringOutput = new String(chars);
        System.out.println(stringOutput);
        scanner.close();
    }

//    public static String changeStr(String str){
//        str.toUpperCase();
//        char[] ch = str.toCharArray();
//        int a = 'A'-'a';   //获得大小写之间差值
//        for(int i = 0; i < ch.length; i++){
//            if('a' <= ch[i] && ch[i] <= 'z'){
//                ch[i] = (char)(ch[i]+a);
//            }else if('A' <= ch[i] && ch[i] <= 'Z'){
//                ch[i] = (char)(ch[i]-a);
//            }
//        }
//        String s=new String(ch);
//        return s;
//    }
}

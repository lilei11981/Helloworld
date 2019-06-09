package com.company.string;

/**
 * Created by lilei on 2017/8/12 下午1:41.
 * 使用 String 类 toUpperCase()方法将字符串从小写转为大写
 */

public class StringToUpperCase {
//    public static void main(String[] args) {
//        String string = "game of thrones";
//        String stringUpper = string.toUpperCase();
//        System.out.println("原始字符串：" + string);
//        System.out.println("转换为大写：" + stringUpper);
//    }
public static String changeStr(String str) {
    str.toUpperCase();
    char[] ch = str.toCharArray();
    StringBuffer sb = new StringBuffer();
    int a = 'A' - 'a';   //获得大小写之间差值
    for (int i = 0; i < ch.length; i++) {
        if ('a' <= ch[i] && ch[i] <= 'z') {
            ch[i] = (char) (ch[i] + a);
        }
        sb.append(ch[i]);
    }

    return sb.toString();
}

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(changeStr("aAF23fqe"));
    }
}

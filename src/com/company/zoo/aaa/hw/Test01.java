package com.company.zoo.aaa.hw;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-09-06
 * Time: 下午4:44
 * Description:
 * <p>
 * 有这样一道智力题：
 * 某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有10个空汽水瓶，她最多可以换多少瓶汽水喝？
 * 答案是5瓶
 * <p>
 * 方法如下：
 * 先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借
 * 给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 * <p>
 * 输入描述：
 * 输入文件最多包含10组测试数据，每个数据占一行，仅包含一个正整数n（1<=n<=100），表示小张手上的空汽水瓶数。
 * n=0表示输入结束，你的程序不应当处理这一行。
 * <p>
 * 输出描述:
 * 对于每组测试数据，输出一行，表示最多可以喝的汽水瓶数。如果一瓶也喝不到，输出0。
 * <p>
 * 输入例子:
 * 3
 * 10
 * 81
 * <p>
 * 输出例子:
 * 1
 * 5
 * 40
 */

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();  // 空汽水瓶数
            int count = 0;  // 能喝汽水瓶数
            if (n > 0) {
                while (n > 1) {
                    count += n / 3;  // 能喝的汽水瓶数 = 空汽水瓶数 / 3
                    n = n / 3 + n % 3;  // 空汽水瓶数 = 换的汽水瓶数 + 剩余汽水瓶数
                    if (n == 2) {  // 当n为2时，可多换一瓶
                        n++;
                    }
                }
            }
            System.out.println("能喝的汽水瓶数：" + count);
        }
        scanner.close();
    }
}

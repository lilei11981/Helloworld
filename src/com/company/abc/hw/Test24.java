package com.company.abc.hw;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-15
 * Time: 4:02 PM
 * Description:
 * 尾号限行：输入一串车牌号码，以逗号分割开，车牌号码有以下要求，只要取后五位,如：AD123，12101，中国 的车牌号不可能全是字母。
 * 现在对尾号进行限制：尾号为1,6则周一限行，尾号为2,7则周二限行，尾号为3,8则周三限行 尾号为4,9则周四限行,尾号为5,0的周五限行.
 * 周六周日不限行。尾号不为数字，则看第4位是否是数字，如果第4位还不是 数字，继续看第3位，以此下去，直到找到有数字的时候止.
 * 由于用户不熟悉系统，有可能输入错误车牌，如车牌不满5位或大于5位、车牌全是字母、没用逗号分割等，如有输入错误情况 一律返回error
 * 如输入没有问题则返回限行的车牌号,如没有，刚返回空.
 * 例如： 输入：String theCarCard = "A1023,NB123,D12ZG",int limitDate = 3;
 * 输出：A1023,NB123
 * String limitedCarCard(String input)
 */

public class Test24 {
    public static void main(String[] args) {
        Test24 test = new Test24();
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int limitDay = input.nextInt();
        System.out.println("车牌号：" + string);
        System.out.println("限行日：" + limitDay);
        String result = test.limitCar(string, limitDay);
        System.out.println("限行车牌：" + result);
    }

    public String limitCar(String inputString, int inputLimitDay) {
        ArrayList<String> list = new ArrayList<>();
        int[] limitNumber = new int[2]; // 除了周末每天都两种尾号的车被限行
        switch (inputLimitDay) {
            case 1: {
                limitNumber[0] = 1;
                limitNumber[1] = 6;
                break;
            }
            case 2: {
                limitNumber[0] = 2;
                limitNumber[1] = 7;
                break;
            }
            case 3: {
                limitNumber[0] = 3;
                limitNumber[1] = 8;
                break;
            }
            case 4: {
                limitNumber[0] = 4;
                limitNumber[1] = 9;
                break;
            }
            case 5: {
                limitNumber[0] = 5;
                limitNumber[1] = 0;
                break;
            }
            case 6:
            case 7: {
                limitNumber[0] = 10;
                limitNumber[1] = 10;
                break;
            }
            default: {
                break;
            }
        }
        String[] strings = inputString.split(",");
        if (strings.length == 1) {
            System.out.println("输入字符串里没有逗号");
            list.add("error");
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > 5 || strings[i].length() < 5) {
                System.out.println("输入字符串长度错误");
                list.add("error");
            } else if (strings[i].matches("[A-Z]{5}")) {
                System.out.println("输入字符串全是字母");
                list.add("error");
            } else if (!strings[i].matches("[A-Z0-9]+")) {
                System.out.println("输出字符串不符合要求");
                list.add("error");
            } else {
                for (int j = 4; j >= 0; j--) {
                    if ((strings[i].charAt(j) + "").matches("[0-9]")) {
                        String number = strings[i].charAt(j) + "";
                        for (int k = 0; k < limitNumber.length; k++) {
                            if (limitNumber[k] == Integer.parseInt(number)) {
                                list.add(strings[i] + "");
                            }
                        }
                        break;
                    }
                }
            }
        }
        return list.toString();
    }
}

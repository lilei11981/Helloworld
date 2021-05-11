package com.company.zoo.abc.demo09;

/**
 * @author lilei
 * @date 2020-06-28 17:34
 * @apiNote
 */

public class NullPointTest {
    public static void main(String[] args) {
        String a = null;
        String b = "1";
        try {
            System.out.println(a.equals(b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }

    }
}

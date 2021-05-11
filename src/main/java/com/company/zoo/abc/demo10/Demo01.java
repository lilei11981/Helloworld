package com.company.zoo.abc.demo10;

import java.util.Calendar;
import java.util.Objects;

/**
 * @author lilei
 * @date 2020-06-29 12:34
 * @apiNote
 */

public class Demo01 {
    public static void main(String[] args) {

//        HashMap map = new HashMap();
//        map.put("1","a");
//        map.put("2","b");
//        System.out.println(map);
//        ArrayList list = new ArrayList();
//
//        Collections.sort(list);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        System.out.println(calendar.getTime());

        Objects.hash(calendar);

        String abc = "abc";

        String format = String.format(abc, "%s ");
    }
}

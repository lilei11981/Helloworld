package com.company.reflect.reflect02;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author lilei
 * @date 2020-07-09 13:19
 * @apiNote
 */

public class Reflect02 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        ClassLoader classLoader = Reflect02.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("file/test.properties");
        properties.load(inputStream);

        String name = properties.getProperty("name");
        String weight = properties.getProperty("Weight");
        String height = properties.getProperty("Height");

//        Class clazz = Class.forName(name);
//        Object o = clazz.newInstance();
        System.out.println(name);
    }
}

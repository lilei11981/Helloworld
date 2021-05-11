package com.company.basic.propertiesTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-11-28
 * Time: 上午11:07
 * Description:
 * 读取 *.properties 文件
 */

public class PropertiesGet {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("test.properties"));
        Enumeration enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements()) {
            String stringKey = (String) enumeration.nextElement();
            String stringValue = properties.getProperty(stringKey);
            System.out.println(stringKey + " = " + stringValue);
        }
    }
}

package com.company.zoo.test.propertiesTest;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-11-28
 * Time: 下午2:16
 * Description:
 * 读取 *.properties 属性列表，生成属性文件 *.properties
 */

public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            // 读取属性文件
            InputStream inputStream = new BufferedInputStream(new FileInputStream("test.properties"));
            properties.load(inputStream);
            Iterator<String> iterator = properties.stringPropertyNames().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                System.out.println(key + " : " + properties.getProperty(key));
            }
            inputStream.close();

            // 保存属性到 demo.properties
            FileOutputStream fileOutputStream = new FileOutputStream("demo.properties", true); // true 表示追加打开
            properties.setProperty("Phone", "12345678");
            properties.store(fileOutputStream, "新增属性文件");
            fileOutputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.company.test.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

/**
 * Created by user on 2018/2/6.
 */
public class Test01 {
    public static void main(String[] args) {
        String xmlString = "<root><people>lilei</people></root>";

        try {

            Document document = DocumentHelper.parseText(xmlString);

            System.out.println(document.asXML());
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}

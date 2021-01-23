package com.company.zoo.aaa.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilei
 * @date 2020-12-27 下午3:14
 * @apiNote -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError
 */

public class Demo21 {

    public static void main(String[] args) {

        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }

    static class OOMObject {

    }
}

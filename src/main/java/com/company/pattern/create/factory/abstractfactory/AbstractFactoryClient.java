package com.company.pattern.create.factory.abstractfactory;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * @author lilei
 * @date 2021-05-05 下午5:57
 * @apiNote
 */

public class AbstractFactoryClient {
    public static void main(String[] args) throws IOException {
        // 创建AbstractFactory，实际类型是FastFactory:
        AbstractFactory factory = new FastFactory();
        // 生成Html文档:
        HtmlDocument html = factory.createHtml("#Hello\nHello, world!");
        html.save(Paths.get(".", "fast.html"));
        // 生成Word文档:
        WordDocument word = factory.createWord("#Hello\nHello, world!");
        word.save(Paths.get(".", "fast.doc"));
    }
}

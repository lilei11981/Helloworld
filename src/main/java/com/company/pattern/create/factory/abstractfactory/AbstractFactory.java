package com.company.pattern.create.factory.abstractfactory;

/**
 * @author lilei
 * @date 2021-05-05 下午5:50
 * @apiNote
 */

public interface AbstractFactory {
    // 创建Html文档:
    HtmlDocument createHtml(String md);

    // 创建Word文档:
    WordDocument createWord(String md);
}

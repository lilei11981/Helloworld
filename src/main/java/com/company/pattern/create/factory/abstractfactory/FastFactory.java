package com.company.pattern.create.factory.abstractfactory;

/**
 * @author lilei
 * @date 2021-05-05 下午5:52
 * @apiNote
 */

public class FastFactory implements AbstractFactory {
    @Override
    public HtmlDocument createHtml(String md) {
        return new FastHtmlDocument(md);
    }

    @Override
    public WordDocument createWord(String md) {
        return new FastWordDocument();
    }
}

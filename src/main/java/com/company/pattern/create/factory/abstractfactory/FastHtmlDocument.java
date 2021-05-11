package com.company.pattern.create.factory.abstractfactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author lilei
 * @date 2021-05-05 下午5:51
 * @apiNote
 */

public class FastHtmlDocument implements HtmlDocument {
    public FastHtmlDocument() {
    }

    public FastHtmlDocument(String md) {

    }

    @Override
    public String toHtml() {
        return null;
    }

    @Override
    public void save(Path path) throws IOException {

    }
}

package com.company.pattern.create.factory.abstractfactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author lilei
 * @date 2021-05-05 下午5:48
 * @apiNote
 * Html文档接口:
 */

public interface HtmlDocument {
    String toHtml();

    void save(Path path) throws IOException;
}

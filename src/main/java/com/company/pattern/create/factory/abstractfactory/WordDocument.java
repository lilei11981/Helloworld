package com.company.pattern.create.factory.abstractfactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author lilei
 * @date 2021-05-05 下午5:49
 * @apiNote
 * Word文档接口:
 */

public interface WordDocument {
    void save(Path path) throws IOException;
}

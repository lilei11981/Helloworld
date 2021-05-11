package com.company.pattern.create.factory.abstractfactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author lilei
 * @date 2021-05-05 下午5:52
 * @apiNote
 */

public class FastWordDocument implements WordDocument {

    public FastWordDocument() {
    }

    public FastWordDocument(String md) {
    }

    @Override
    public void save(Path path) throws IOException {

    }
}

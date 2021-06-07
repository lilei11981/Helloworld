package com.company.file.fileoperate;

import com.company.utils.FourElementsGenerateUtil;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author lilei
 * @date 2021-05-24 下午9:54
 * @apiNote
 */

public class FileDemo1 {

    public static void main(String[] args) throws Exception {
        Path path = Paths.get("./file/data.txt");
        for (int i = 0; i < 100; i++) {
            String phone = FourElementsGenerateUtil.getMobilePhone() + ",";
            Files.write(path, phone.getBytes(), StandardOpenOption.APPEND);
        }
    }
}

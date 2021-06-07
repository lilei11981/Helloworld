package com.company.file.fileoperate;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lilei
 * @date 2021-05-28 下午4:37
 * @apiNote
 */

public class FileDemo4 {

    public static void main(String[] args) throws Exception {
        File file = new File("./file/data01.txt");
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis, "utf-8"), 5 * 1024 * 1024);// 用5M的缓冲读取文本文件

        // String line = "";
        // while ((line = reader.readLine()) != null) {
        //     System.out.println(line);
        // }

        String line = reader.readLine();
        // System.out.println(line);

        String[] phones = line.split(",");

        Map<String, Integer> map = new HashMap<>(phones.length);

        for (String phone : phones) {
            Integer num = map.get(phone);
            if (num == null) {
                num = 0;
            }
            if (num != 0) {
                num++;
                map.put(phone, num);
            } else {
                map.put(phone, 1);
            }
        }

        System.out.println(map);
        System.out.println(map.size());

    }
}

package com.company.utils.java.base.util.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./doc/file.txt");
        try (FileOutputStream fos = new FileOutputStream(file, true);
             OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
             BufferedWriter bfw = new BufferedWriter(osw)) {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                bfw.write("loginSave1");
                bfw.write("\n");
                bfw.flush();
                Thread.sleep(10);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

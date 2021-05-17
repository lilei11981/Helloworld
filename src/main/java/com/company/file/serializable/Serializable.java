package com.company.file.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author lilei
 * @date 2020-07-05 11:49
 * @apiNote
 */

public class Serializable {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file/serializable.txt"));
            Person person = new Person("杨过", 20);
            oos.writeObject(person);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

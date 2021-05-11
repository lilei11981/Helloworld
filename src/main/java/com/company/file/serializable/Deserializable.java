package com.company.file.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author lilei
 * @date 2020-07-05 11:57
 * @apiNote
 */

public class Deserializable {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file/serializable.txt"));
            Object object = ois.readObject();
            System.out.println(object);
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

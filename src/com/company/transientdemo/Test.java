package com.company.transientdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author lilei
 * @date 2020-06-14 15:56
 * @apiNote
 */

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serializeUser();
        deSerializeUser();
    }

    public static void serializeUser() throws IOException {
        User user = new User();
        user.setName("abc");
        user.setAge(12);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("/Users/lilei/IdeaProjects/HelloWorld/a/a.txt"));
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
    }

    public static void deSerializeUser() throws IOException, ClassNotFoundException {
        File file = new File("/Users/lilei/IdeaProjects/HelloWorld/a/a.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        User newUser = new User();
        newUser = (User) objectInputStream.readObject();
        System.out.println(newUser.getAge());
    }
}

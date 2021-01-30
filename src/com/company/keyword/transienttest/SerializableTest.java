package com.company.keyword.transienttest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by lilei on 2017/11/6 下午3:05.
 *
 * @description 使用transient关键字不序列化某个变量
 * <p>
 * 注意读取的时候，读取数据的顺序一定要和存放数据的顺序保持一致
 */

public class SerializableTest {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("Jon");
        user.setPassWord("123456");
        System.out.println("Read before Serializable");
        System.out.println("UserName: " + user.getUserName());
        System.err.println("PassWord: " + user.getPassWord());

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/lilei/ideaprojects/helloworld/user.txt"));
            objectOutputStream.writeObject(user);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            User.userName = "Sansa";

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/lilei/ideaprojects/helloworld/user.txt"));
            user = (User) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println("Read after Serializable: ");
            System.out.println("UserName: " + user.getUserName());
            System.err.println("PassWord: " + user.getPassWord());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class User implements Serializable {
    private static final long serialVersionUID = 8294180014912103005L;
    public static String userName;
    private transient String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}

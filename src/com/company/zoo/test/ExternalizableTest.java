package com.company.zoo.test;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Created by lilei on 2017/11/6 下午4:42.
 */
public class ExternalizableTest implements Externalizable {
    private transient String content = "不管有没有被 transient 修饰，都将被序列化";

    public static void main(String[] args) throws Exception {
        ExternalizableTest externalizableTest = new ExternalizableTest();
        ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream(new File("test.txt")));
        objectOutput.writeObject(externalizableTest);
        ObjectInput objectInput = new ObjectInputStream(new FileInputStream(new File("test.txt")));
        externalizableTest = (ExternalizableTest) objectInput.readObject();
        System.out.println(externalizableTest.content);
        objectOutput.close();
        objectInput.close();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(content);
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        content = (String) objectInput.readObject();
    }
}

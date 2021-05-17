package com.company.zoo.abc.demo33;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author lilei
 * @date 2021/5/17 9:38 下午
 * @apiNote
 */

public class Hessian02 {


    public static void main(String[] args) throws Exception {
        User user = new User("张三", 23);


        long s1 = System.currentTimeMillis();
        User hessianUser = new User();
        for (int i = 0; i < 100000; i++) {
            byte[] bytes = hessianSerialize(user);
            hessianUser = (User) hessianDeserialize(bytes);
        }
        System.out.println(hessianUser);
        long e1 = System.currentTimeMillis();
        System.out.println(e1 - s1);

        long s2 = System.currentTimeMillis();
        User jdkUser = new User();
        for (int i = 0; i < 100000; i++) {
            byte[] bytes = jdkSerialize(user);
            jdkUser = (User) jdkDeserialize(bytes);
        }
        System.out.println(jdkUser);
        long e2 = System.currentTimeMillis();
        System.out.println(e2 - s2);

//        System.out.println("hessian: " + hessianSerialize(user).length);
//        System.out.println("jdk: " + jdkSerialize(user).length);

    }

    private static byte[] hessianSerialize(Object o) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Hessian2Output output = new Hessian2Output(baos);
        output.writeObject(o);
        output.flush();
        byte[] bytes = baos.toByteArray();
        output.close();
        baos.close();
        return bytes;
    }

    private static Object hessianDeserialize(byte[] bytes) throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        Hessian2Input input = new Hessian2Input(bais);
        Object o = input.readObject();
        input.close();
        bais.close();
        return o;
    }

    private static byte[] jdkSerialize(Object o) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream output = new ObjectOutputStream(baos);
        output.writeObject(o);
        output.flush();
        byte[] bytes = baos.toByteArray();
        baos.close();
        output.close();
        return bytes;
    }

    private static Object jdkDeserialize(byte[] bytes) throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream input = new ObjectInputStream(bais);
        Object o = input.readObject();
        input.close();
        bais.close();
        return o;
    }
}

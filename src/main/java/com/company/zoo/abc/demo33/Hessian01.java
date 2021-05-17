package com.company.zoo.abc.demo33;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @author lilei
 * @date 2021/5/17 9:17 下午
 * @apiNote
 */

public class Hessian01 {

    public static void main(String[] args) throws Exception{
        User user = new User("张三", 23);
        byte[] bytes = serialize(user);
        System.out.println(bytes.length);
        User newUser = (User)deserialize(bytes);
        System.out.println(newUser);
    }

    private static byte[] serialize(Object o) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Hessian2Output output = new Hessian2Output(baos);
        output.writeObject(o);
        output.flush();
        byte[] bytes = baos.toByteArray();
        baos.close();
        output.close();
        return bytes;
    }

    private static Object deserialize(byte[] bytes) throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        Hessian2Input input = new Hessian2Input(bais);
        Object o = input.readObject();
        bais.close();
        input.close();
        return o;
    }
}

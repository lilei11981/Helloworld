package com.shrbank.util;

import Decoder.BASE64Decoder;
import Decoder.BASE64Encoder;

import java.io.IOException;

/**
 * Created by user on 2018/2/2.
 */
public class Base64Util {
    public static String encryptBase64(byte[] data) {
        return new BASE64Encoder().encode(data);
    }

    public static String decryptBase64(String data) throws IOException {
        byte[] resultBytes = new BASE64Decoder().decodeBuffer(data);
        return new String(resultBytes);
    }


    // 待加密的明文
    public static final String DATA = "lilei";
    public static void main(String[] args) throws IOException {
        String base64Result = Base64Util.encryptBase64(DATA.getBytes());
        System.out.println(base64Result);

        String base64String = Base64Util.decryptBase64(base64Result);
        System.out.println(base64String);

    }
}

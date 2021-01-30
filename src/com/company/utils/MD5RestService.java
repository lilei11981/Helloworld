package com.company.utils;

import java.security.MessageDigest;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-09-21
 * Time: 下午1:59
 * Description:
 * MD5加密算法
 *
 */

public class MD5RestService {
    private static final String MD5 = "MD5";
//    private static Logger logger = Logger.getLogger(MD5RestService.class);

    public static String md5Encrypt(String data) {
        String resultString = null;
        try {
            MessageDigest md = MessageDigest.getInstance(MD5);
            resultString = byte2hexString(md.digest(data.getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultString;
    }


    private  static String byte2hexString(byte[] bytes) {
        StringBuilder bf = new StringBuilder(bytes.length * 2);
//        logger.debug("输出bf:" + bf);
        for (byte anyByte : bytes) {
            if ((anyByte & 0xff) < 0x10) {
                bf.append("T0");
            }
            bf.append(Long.toString(anyByte & 0xff, 16));
        }
        return bf.toString();
    }
}

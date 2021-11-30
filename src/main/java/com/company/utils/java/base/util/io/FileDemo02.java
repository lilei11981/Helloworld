package com.company.utils.java.base.util.io;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class FileDemo02 {
    public static void main(String[] args) throws UnknownHostException {

        String ip = Inet4Address.getLocalHost().getHostAddress();
        //        int ipInt = Integer.parseInt(ip);
        System.out.println(ip);
    }
}

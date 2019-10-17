package com.company.util;

/**
 * @author lilei
 * @time 2019-10-14 12:44
 * @description
 */

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.regex.Pattern;

//private static String DEMAIN = "https://taoquan.taobao.com/coupon/unify_apply.htm?";//TAOBAO.JU.BASEURL
//private String[] urlelements;
//
//public GeneratorLink(String... parameters) {
//        this.urlelements = parameters;
//        }
//
//public String link() {
//        return GeneratorLink.DEMAIN + String.join("&", this.urlelements);
//        }
//
//public static void main(String[] args) {
//        System.out.println(new GeneratorLink("sellerId=725677994&activityId=b309471ab299474c800ec0426f788ba4").link());
//        }

//[请把上面代码的输出结果替换为下面代码中的{X}]
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.regex.Pattern;

class GeneratorLink {
    private String DEMAIN = "aHR0cHMlM0ElMkYlMkZ0YW9xdWFuLnRhb2Jhby5jb20lMkZjb3Vwb24lMkZ1bmlmeV9hcHBseS5odG0lM0ZzZWxsZXJJZCUzRDcyNTY3Nzk5NCUyNg==";// TAOBAO.JU.BASEURL
    private List<String> urlelements = new ArrayList<String>();

    public String link() {
        return decode(DEMAIN) + String.join("&", urlelements);
    }

    public void add(String param) {
        String value = param.split("=")[1];
        String str = "";
        for (int i = 0; i < value.length(); i++) {
            if (Pattern.matches("[A-Za-z]", String.valueOf(value.charAt(i)))) {
                str += (char) (((int) (value.charAt(i)) - 1));
            } else {
                str += value.charAt(i);
            }
        }
        urlelements.add(param.split("=")[0] + "=" + str);
    }

    public String encode(String txt) {
        try {
            return Base64.getEncoder().encodeToString(URLEncoder.encode(txt, "UTF-8").getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String decode(String txt) {
        try {
            txt = URLDecoder.decode(new String(Base64.getDecoder().decode(txt.getBytes())), "UTF-8") ;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return txt;
    }

    public static void main(String[] args) {
        GeneratorLink coupon = new GeneratorLink();
        coupon.add("activityId=216bg9b6ce9d424c9773298476962b49");
        System.out.println(coupon.link());
    }
}

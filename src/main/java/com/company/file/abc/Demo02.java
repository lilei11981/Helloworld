package com.company.file.abc;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author lilei
 * @date 2020-07-04 21:19
 * @apiNote
 */

public class Demo02 {
    public static void main(String[] args) {
        try {
            long s = System.currentTimeMillis();
            FileInputStream fis = new FileInputStream("/Users/lilei/IdeaProjects/HelloWorld/file/a/中国银行业协会法律风险管理视频会议截图.jpg");
            FileOutputStream fos = new FileOutputStream("/Users/lilei/IdeaProjects/HelloWorld/file/b/中国银行业协会法律风险管理视频会议截图.jpg");
            int len = 0;

            while ((len = fis.read()) != -1) {
                fos.write(len);
            }

//            byte[] bytes = new byte[1024];
//            while ((len = fis.read(bytes)) != -1) {
//                fos.write(bytes, 0, len);
//            }
            fos.close();
            fis.close();
            long e = System.currentTimeMillis();
            System.out.println("复制文件耗时" + (e - s) + "毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

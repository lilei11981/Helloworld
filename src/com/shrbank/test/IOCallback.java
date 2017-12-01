package com.shrbank.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-11-30
 * Time: 下午3:54
 * Description:
 * Java 接口回调：
 * 可以把使用某一接口的类创建的对象的引用赋给改接口声明的接口变量，那么该接口变量就可以调用
 * 被类实现的接口的方法。实际上，当接口变量调用被类实现的接口中的方法时，就是通知相应的对象
 * 调用接口的方法，这一过程称为对象功能的接口回调。
 * <p>
 * 实例：
 * 定义一个函数来获取文件的字节数组，此时我们想要在测试类获得读取文件后的二进制数组bytes，
 * 我们一般做法是把bytes定义到外部，使用get方法获取
 */

public class IOCallback {

    public static void main(String[] args) {
        IOCallback ioCallback = new IOCallback();

        // 接口式匿名内部类
        // 参数bytes就代表二进制数组的数据
        ioCallback.getFileContent(bytes -> System.out.println("文件内容是：" + new String(bytes)));
    }

    public void getFileContent(final CallBack callBack) {
        // 往往耗时的操作都启动子线程
        new Thread(() -> {
            File file = new File("test.txt");
            FileInputStream inputStream;
            try {
                inputStream = new FileInputStream(file);
                // 根据文件大小来创建字节数组
                byte[] bytes = new byte[(int) file.length()];
                int len = inputStream.read(bytes); // 返回读取字节的长度
                inputStream.close();
                callBack.getBytes(bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    // 回调接口定义
    public interface CallBack {
        public void getBytes(byte[] bytes);
    }
}

package com.shrbank.network.ServerClient;

import java.io.*;
import java.net.Socket;

/**
 * Created by lilei on 2017/7/14.
 *
 * 建立客户端
 * 1. 创建Socket通信，设置通信服务器的IP和port
 * 2. 建立IO输出流，向服务器发送数据消息
 * 3. 建立IO输入流，读取服务器发送来的数据消息
 */

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",8888);   // 创建Socket通信，设置通信服务器的IP和port

            // 构建IO
            InputStream inputStream = socket.getInputStream();    // 建立IO输入流,读取服务器发送来的数据消息
            OutputStream outputStream = socket.getOutputStream();  // 建立IO输出流,向服务器发送数据消息

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            // 向服务器发送一条消息
            bufferedWriter.write("测试客户端和服务器端通信，服务器接收消息返回到客户端\n");
            bufferedWriter.flush();

            // 读取服务器返回的消息
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String message = bufferedReader.readLine();
            System.out.println("服务器：" + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

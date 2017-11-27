package com.shrbank.network.ServerClient;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lilei on 2017/7/14.
 *
 * ServerSocket和Socket通信实例
 * 以下实例演示了如何实现客户端发送消息到服务器，服务器接收消息并读取输出，然后写出到客户端，客户端接收到输出
 * 建立服务器端
 * 1. 服务器建立通信ServerSocket
 * 2. 服务器建立Socket接收客户端连接
 * 3. 建立IO输入流，读取客户端发送的数据
 * 4. 建立IO输出流，向客户端发送数据消息
 */

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);  // 服务器建立通信ServerSocket
            System.out.println("启动服务器……");
            Socket socket = serverSocket.accept();    // 服务器建立Socket接收客户端连接
            System.out.println("客户端：" + socket.getInetAddress().getLocalHost() + " 已连接到服务器");  // 获取本地客户端地址

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // 读取客户端发送的数据
            String message = bufferedReader.readLine();
            System.out.println("客户端：" + message);

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            // 建立IO输出流，向客户端发送数据消息
            bufferedWriter.write(message + "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

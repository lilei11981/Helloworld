package com.lilei1998.network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lilei on 2017/7/14.
 * 使用Socket类的accept()方法和ServerSocket类的MultiThreadServer(socketname)方法来实现多线程服务器程序
 */
public class MultiThreadServer implements Runnable {
    private Socket socket;

    private MultiThreadServer(Socket socket) {
        this.socket = socket;
    }

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Listening");
        while (true) {
            Socket sock = serverSocket.accept();        // Socket类的accepted()方法
            System.out.println("Connected");
            new Thread(new MultiThreadServer(sock)).start();
        }
    }

    public void run() {
        try {
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            for (int i = 100; i >= 0; i--) {
                printStream.println(i + " bottles of beer on the wall");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

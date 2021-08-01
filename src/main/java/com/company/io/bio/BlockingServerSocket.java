package com.company.io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lilei
 * @date 2021-07-31 下午2:07
 * @apiNote
 */

public class BlockingServerSocket {

    public static void main(String[] args) throws IOException {
        ExecutorService threadPool = Executors.newCachedThreadPool();
        ServerSocket serverSocket = new ServerSocket(8080);

        while (true) {
            Socket socket = serverSocket.accept();
            threadPool.execute(() -> {
                try {
                    handler(socket);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    /**
     * 处理客户端请求
     */
    private static void handler(Socket socket) throws IOException {
        byte[] bytes = new byte[1024];

        InputStream inputStream = socket.getInputStream();
        socket.close();

        while (true) {
            int read = inputStream.read(bytes);
            if (read != -1) {
                System.out.println("msg from client: " + new String(bytes, 0, read));
            } else {
                break;
            }
        }
    }

}

package com.company.network.fileupload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @author lilei
 * @date 2020-07-05 14:48
 * @apiNote
 */

public class FileUploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        File file = new File("file/server/");
                        if (!file.exists()) {
                            if (file.mkdirs()) {
                                System.out.println("目录" + file.getPath() + "创建成功");
                            }
                        }
                        String filename = file.getPath() + File.separator + System.currentTimeMillis() + new Random().nextInt(100000) + ".txt";
                        System.out.println(Thread.currentThread().getName());
                        FileOutputStream fos = new FileOutputStream(filename);
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes, 0, len);
                        }
                        fos.flush();
                        socket.getOutputStream().write("上传成功".getBytes());
                        fos.close();
                        socket.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}

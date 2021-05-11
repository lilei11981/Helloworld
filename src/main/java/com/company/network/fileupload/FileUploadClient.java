package com.company.network.fileupload;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author lilei
 * @date 2020-07-05 14:48
 * @apiNote
 */

public class FileUploadClient {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            uploadFile();
        }
    }

    public static void uploadFile() {
        try {
            FileInputStream fis = new FileInputStream("file/client/upload.txt");
            Socket socket = new Socket("127.0.0.1", 8888);
            OutputStream os = socket.getOutputStream();
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fis.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
            socket.shutdownOutput();
            InputStream is = socket.getInputStream();
            while ((len = is.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
            fis.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

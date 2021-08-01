package com.company.io.bio;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

/**
 * @author lilei
 * @date 2021-07-31 下午2:12
 * @apiNote
 */

public class ZeroCopyClientDemo {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("127.0.0.1", 8080));
        String fileName = "file/05_GC and Tuning.pdf";

        // 得到一个文件 channel
        FileChannel fileChannel = new FileInputStream(fileName).getChannel();

        // 使用零拷贝 IO 技术发送
        long transferSize = fileChannel.transferTo(0, fileChannel.size(), socketChannel);
        System.out.println("file transfer done, size: " + transferSize);
        fileChannel.close();
    }

}

package com.company.file.aaa;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author lilei
 * @date 2021-08-01 下午4:19
 * @apiNote
 */

public class FileChannelDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("file/newFile.txt");
        FileOutputStream outputStream = new FileOutputStream(file);
        FileChannel channel = outputStream.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String string = "java nio";
        buffer.put(string.getBytes());
        //此处必须要调用buffer的flip方法
        buffer.flip();
        channel.write(buffer);
        channel.close();
        outputStream.close();
    }
}

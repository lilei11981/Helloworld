package com.company.file.fileoperate;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lilei
 * @date 2021-05-28 下午4:47
 * @apiNote
 */

public class FileDemo5 {

    public static void main(String[] args) throws Exception {
        final int BUFFER_SIZE = 0x300000 * 12;

        File f = new File("./file/data01.txt");

        MappedByteBuffer inputBuffer = new RandomAccessFile(f, "r").getChannel().map(FileChannel.MapMode.READ_ONLY,
                f.length() / 2, f.length() / 2);

        byte[] dst = new byte[BUFFER_SIZE];

        Map<String, Integer> map = new HashMap<>();

        for (int offset = 0; offset < inputBuffer.capacity(); offset += BUFFER_SIZE) {

            if (inputBuffer.capacity() - offset >= BUFFER_SIZE) {

                for (int i = 0; i < BUFFER_SIZE; i++)

                    dst[i] = inputBuffer.get(offset + i);

            } else {

                for (int i = 0; i < inputBuffer.capacity() - offset; i++)

                    dst[i] = inputBuffer.get(offset + i);

            }

            int length = (inputBuffer.capacity() % BUFFER_SIZE == 0) ? BUFFER_SIZE
                    : inputBuffer.capacity() % BUFFER_SIZE;

            // System.out.println(new String(dst, 0, length));// new
            // String(dst,0,length)这样可以取出缓存保存的字符串，可以对其进行操作

            String line = new String(dst, 0, length);
            String[] phones = line.split(",");
            for (String phone : phones) {
                Integer num = map.get(phone);
                if (num == null) {
                    num = 0;
                }
                if (num != 0) {
                    num++;
                    map.put(phone, num);
                } else {
                    map.put(phone, 1);
                }
            }

        }

        System.out.println(map);
        System.out.println(map.size());
    }
}

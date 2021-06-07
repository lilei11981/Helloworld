package com.company.file.fileoperate;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lilei
 * @date 2021-05-28 下午5:03
 * @apiNote
 */

public class FileDemo6 {

    public static void main(String[] args) throws Exception {
        int bufSize = 1024 * 12;
        byte[] bs = new byte[bufSize];
        ByteBuffer byteBuf = ByteBuffer.allocate(bufSize);
        File file = new File("./file/data01.txt");
        FileChannel channel = new RandomAccessFile(file, "r").getChannel();
        Map<String, Integer> map = new HashMap<>();
        while (channel.read(byteBuf) != -1) {
            int size = byteBuf.position();
            byteBuf.rewind();
            byteBuf.get(bs);
            // System.out.print(new String(bs, 0, size));
            String line = new String(bs, 0, size);
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
            byteBuf.clear();
        }
        System.out.println(map);
        System.out.println(map.size());
    }
}

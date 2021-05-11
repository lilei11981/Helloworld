package com.company.zoo.abc.demo08;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lilei
 * @date 2020-06-28 17:28
 * @apiNote 没效果
 */

public class OutOfMemory02 {
    public static void main(String[] args) throws Exception {
        Map<Key, String> map = new HashMap<Key, String>();
        while (true) {
            for (int i = 0; i < 10000; i++) {
                if (!map.containsKey(new Key(i))) {
                    map.put(new Key(i), "Number:" + i);
                }
            }

            //Thread.sleep(1000L);
        }
    }

    static class Key {
        Integer id;

        Key(Integer id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }
    }
}

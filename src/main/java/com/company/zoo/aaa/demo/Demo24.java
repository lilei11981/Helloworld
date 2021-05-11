package com.company.zoo.aaa.demo;

import java.util.TreeMap;

/**
 * @author lilei
 * @date 2021-01-20 下午5:03
 * @apiNote
 */

public class Demo24 {

//    public static void main(String[] args) {
//
//        for (int i = 0; i < 100; i++) {
//            if (i == 50) {
//                try {
//                    throw new RuntimeException("运行时异常");
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println(i);
//        }
//    }

//    public static void main(String[] args) {
//        StringBuilder stringBuilder;
//        StringBuffer stringBuffer;
//    }

//    public static void main(String[] args) {
//        String a = new String("1234");
//        String b = new String("1234");
//        System.out.println(a.equals(b));
//        System.out.println(a==b);
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine();
//        System.out.println(string);
//        scanner.close();
//    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String string = bufferedReader.readLine();
//        System.out.println(string);
//        bufferedReader.close();
//    }


//    public static void main(String[] args) {
//        Reader reader;
//    }

    public static void main(String[] args) {
//        Hashtable hashtable = new Hashtable();
//        hashtable.put("a",null);

//        HashMap<Integer,Integer> hashMap = new HashMap<>(8);
//        hashMap.put(2,3);
//        hashMap.put(2,4);
//        System.out.println(hashMap);

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 2);
        treeMap.put(3, 5);
        treeMap.put(2, 4);
        System.out.println(treeMap);

    }
}

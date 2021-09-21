package com.company.zoo.aaa.demo03;

/**
 * @author lilei
 * @date 2021-09-19 上午10:56
 * @apiNote
 */

public class Demo06 {
    //注意volatile！！！！！！！！！！！！！！！！！
    private /*volatile*/ static Singleton instance;

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> System.out.println(System.identityHashCode(getInstance()))).start();
        }
    }

    public static Singleton getInstance() {
        //第一次null检查
        if (instance == null) {
            synchronized (Singleton.class) {  //1
                //第二次null检查
                if (instance == null) {     //2
                    instance = new Singleton();//3
                }
            }
        }
        return instance;
    }

    static class Singleton {
        private String string;

        public Singleton() {
            for (int i = 0; i < 100000000; i++) {

            }
        }
    }
}

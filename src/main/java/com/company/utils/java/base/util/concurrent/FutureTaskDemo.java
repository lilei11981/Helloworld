package com.company.utils.java.base.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/*方法中可能会调用到多个服务/方法，且这些服务/方法之间是互相独立的，不存在先后关系。
在高并发场景下，如果执行比较耗时，可以考虑多线程异步的方式调用。*/
public class FutureTaskDemo {

    public static void main(String[] args) {
        testNotUseFutureTask();
        testUseFutureTask();
    }

    private static void testUseFutureTask() {
        long userId = 12;
        long startTime = System.currentTimeMillis();

        Callable<String> userInfoCallable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return queryUserInfo(userId);
            }
        };
        Callable<String> userAddressCallable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return queryUserAddress(userId);
            }
        };
        FutureTask<String> userInfoFutureTask = new FutureTask<>(userInfoCallable);
        FutureTask<String> userAddressFutureTask = new FutureTask<>(userAddressCallable);

        new Thread(userInfoFutureTask).start();
        new Thread(userAddressFutureTask).start();

        try {
            String userInfo = userInfoFutureTask.get();
            System.out.println("userInfo = " + userInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String userAddress = userAddressFutureTask.get();
            System.out.println("userAddress = " + userAddress);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("testUseFutureTask 耗时：" + (System.currentTimeMillis() - startTime));
    }

    private static void testNotUseFutureTask() {
        long userId = 12;
        long startTime = System.currentTimeMillis();

        // 获取用户基本信息
        String userInfo = queryUserInfo(userId);
        // 获取用户地址
        String userAddress = queryUserAddress(userId);

        System.out.println("testNotUseFutureTask 耗时：" + (System.currentTimeMillis() - startTime));
    }


    /**
     * 查询用户基本信息，模拟耗时1500ms
     */
    public static String queryUserInfo(long userId) {
        String userInfo = "userInfo: " + userId;

        try {
            TimeUnit.MILLISECONDS.sleep(1500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userInfo;
    }

    /**
     * 查询用户地址，模拟耗时2000ms
     */
    public static String queryUserAddress(long userId) {
        String userAddress = "userAddress: " + userId;
        try {
            TimeUnit.MILLISECONDS.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userAddress;
    }
}

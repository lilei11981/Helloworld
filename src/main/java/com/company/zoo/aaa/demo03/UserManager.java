package com.company.zoo.aaa.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilei
 * @date 2021-09-19 下午2:54
 * @apiNote
 */

public class UserManager {
    public volatile String lastUser; //发布的信息

    public static void main(String[] args) {
        UserManager manager = new UserManager();
        for (int i = 0; i < 100; i++) {
            String a = String.valueOf(i);
            String b = String.valueOf(i);
            new Thread(() -> System.out.println(manager.authenticate(a, b))).start();
        }
        System.out.println(manager.lastUser);
    }

    public boolean authenticate(String user, String password) {
        List<User> activeUsers = new ArrayList<>();
        User u = new User(user, password);
        activeUsers.add(u);
        boolean valid = passwordIsValid(user, password);
        if (valid) {
            lastUser = user;
        }
        System.out.println(activeUsers);
        return valid;
    }

    private boolean passwordIsValid(String user, String password) {
        return user.equals(password);
    }

    static class User {
        String user;
        String password;

        public User(String user, String password) {
            this.user = user;
            this.password = password;
        }

        @Override
        public String toString() {
            return "User{" +
                    "user='" + user + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }
}

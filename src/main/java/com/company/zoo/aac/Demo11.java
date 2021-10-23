package com.company.zoo.aac;

/**
 * @author lilei
 * @date 2021-10-10 上午10:08
 * @apiNote
 */

public class Demo11 {
    public static void main(String[] args) {
        Demo11 pt = new Demo11();
        User hollis = new User();
        hollis.setName("Hollis");
        hollis.setGender("Male");
        pt.pass(hollis);
        System.out.println("print in main , user is " + hollis);
    }

    public void pass(User user) {
        user.setName("hollischuang");
        System.out.println("print in pass , user is " + user);
    }

    public static class User {
        String name;
        String gender;

        public void setName(String name) {
            this.name = name;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }
}

package com.shrbank.test.anonymousInternalClass;

interface Person3 {
    public void eat();
}

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-12-01
 * Time: 下午5:12
 * Description:
 * 在接口上使用匿名内部类
 */

public class Demo3 {
    public static void main(String[] args) {
        Person3 person = new Person3() {
            @Override
            public void eat() {
                System.out.println("eat something3");
            }
        };
        person.eat();
    }

}

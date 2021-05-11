package com.company.zoo.abc.demo32;

/**
 * @author lilei
 * @date 2020-12-11 下午3:24
 * @apiNote
 */

public class Demo32 {

    private static int num = 1;

    public static void main(String[] args) {

        Demo32 demo32 = new Demo32();
        System.out.println(demo32.method());
    }

    public Person method() {
        Person person = null;

        try {
            if (num == 1) {
                throw new RuntimeException("第 " + num + " 次失败异常");
            }
            person = new Person();
            person.setName("ABC");
            person.setAge(12);
            System.out.println("成功");
        } catch (Exception e) {
            System.out.println("重试 " + num + " 次");
            num++;
//            e.printStackTrace();
            person = method();
        }

        return person;
    }
}

package com.company.zoo.abc.demo22;

/**
 * @author lilei
 * @date 2020-08-14 15:28
 * @apiNote
 */

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher2 teacher = new Teacher2();
        teacher.setName("老师");
        teacher.setAge(27);
        Student2 student1 = new Student2();
        student1.setName("学生");
        student1.setAge(18);
        student1.setTeacher(teacher);
        Student2 student2 = (Student2) student1.clone();
        System.out.println("拷⻉后");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getTeacher().getName());
        System.out.println(student2.getTeacher().getAge());
        System.out.println("修改老师的信息后");
        // 修改⽼老老师的信息
        teacher.setName("Games");
        System.out.println(student1.getTeacher().getName());
        System.out.println(student2.getTeacher().getName());
    }


}

class Teacher2 implements Cloneable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student2 implements Cloneable {
    private String name;
    private int age;
    private Teacher2 teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher2 getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher2 teacher) {
        this.teacher = teacher;
    }

    public Object clone() throws CloneNotSupportedException {
        // 改为深复制:
        Student2 student = (Student2) super.clone();
        // 本来是浅复制，现在将Teacher对象复制⼀一份并重新set进来
        student.setTeacher((Teacher2) student.getTeacher().clone());
        return student;
    }
}

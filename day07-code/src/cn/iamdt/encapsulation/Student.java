package cn.iamdt.encapsulation;

/*
    1. 私有成员变量（为了保证数据的安全性）

    2. 针对私有的成员变量，提供对应的serXxx和getXxx方法
 */
public class Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄输入有误，请输入1~120之间的数");
        }
    }
}

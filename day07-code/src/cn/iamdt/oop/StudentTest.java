package cn.iamdt.oop;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println(stu1.name);
        System.out.println(stu1.age);
        stu1.study();
        stu1.eat();
    }
}


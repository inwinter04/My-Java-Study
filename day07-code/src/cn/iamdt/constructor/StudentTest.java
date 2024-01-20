package cn.iamdt.constructor;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 23);
        System.out.println(stu1.name + " ----- " + stu1.age);

        Student stu2 = new Student("李四", 24);
        System.out.println(stu2.name + " ----- " + stu2.age);
    }
}

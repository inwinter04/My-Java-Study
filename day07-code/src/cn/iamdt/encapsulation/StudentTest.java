package cn.iamdt.encapsulation;

public class StudentTest {
    /*
        封装设计规范：合理隐藏，合理暴露
     */
    public static void main(String[] args) {
        Student stu1 = new Student();
        // java: age 在 cn.iamdt.encapsulation.Student 中是 private 访问控制
        //stu1.age = -23;     // 无法直接对数据进行操作，保证数据安全
        stu1.setAge(-23);
        stu1.setAge(23);

        int age = stu1.getAge();
        System.out.println(age);
    }
}

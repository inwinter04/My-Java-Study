package cn.iamdt.test;

import cn.iamdt.domain.Student;

import java.util.ArrayList;

public class ArrayListTest2 {
    /*
        需求：创建一个存储学生对象的集合，存储3个学生对象
                                   在控制台展示出低于18岁的学生
     */
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("李四", 14);
        Student stu3 = new Student("王五", 15);

        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (student.getAge() < 18) {
                System.out.println(student.getName() + "---" + student.getAge());
            }
        }
    }
}

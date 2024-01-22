package cn.iamdt.test;

import cn.iamdt.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3 {
    /*
        需求：创建一个储存学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
                   学生的姓名和年龄来自键盘录入
     */
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生信息");
            addStudent(list);
        }

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "---" + stu.getAge());
        }
    }

    private static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.print("请输入学生年龄：");
        int age = sc.nextInt();

        Student stu = new Student(name, age);
        list.add(stu);
    }
}

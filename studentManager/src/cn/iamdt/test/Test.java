package cn.iamdt.test;

import cn.iamdt.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 增删改查都是围绕着集合list进行操作
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.print("请输入您的选择：");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(list);
                    break;
                case 2:
                    deleteStudentByID(list);
                    break;
                case 3:
                    updateStudentInfoByID(list);
                    break;
                case 4:
                    queryStudentInfos(list);
                    break;
                case 5:
                    System.out.println("感谢您的使用，再见！");
                    System.exit(0);                 // 结束Java虚拟机的运行
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
            }
        }
    }

    /**
     * 增加学生
     */
    private static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        String id = "";

        System.out.print("请输入学生学号：");
        while (true) {
            id = sc.next();
            if (getIndex(id, list) == -1) {
                break;
            } else {
                System.out.print("此学号已被占用，请重新输入:");
            }
        }
        System.out.print("请输入学生姓名：");
        String name = sc.next();
        System.out.print("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.print("请输入学生生日：");
        String birthday = sc.next();

        Student stu = new Student(id, name, age, birthday);

        list.add(stu);
    }

    /**
     * 修改学生
     */
    private static void updateStudentInfoByID(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您想修改的学生学号：");
        String id = sc.nextLine();

        int index = getIndex(id, list);
        if (index == -1) {
            System.out.println("查无此人！请查验！");
        } else {
            System.out.print("请输入学生姓名：");
            String name = sc.next();
            System.out.print("请输入学生年龄：");
            int age = sc.nextInt();
            System.out.print("请输入学生出生日期：");
            String birthday = sc.next();

            Student stu = new Student(id, name, age, birthday);

            list.set(index, stu);
            System.out.println("修改成功！");
        }

    }

    /**
     * 删除学生
     */
    private static void deleteStudentByID(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入您要删除的学生学号：");
        String id = sc.nextLine();
        int index = getIndex(id, list);

        if (index == -1) {
            System.out.println("删除失败，无法找到学生！");
        } else {
            list.remove(index);
            System.out.println("成功删除学生" + id);
        }
    }

    /**
     * 查看学生
     */
    private static void queryStudentInfos(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("暂无信息，快去添加一个吧！");
        } else {
            System.out.println("学号\t\t\t姓名\t年龄\t出生日期");
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthday());
            }
        }
    }

    /**
     * 通过ID查询学生所在索引
     */
    private static int getIndex(String id, ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            // stu.getId() 待匹配的学生ID
            // id 需匹配的学生ID
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }


}

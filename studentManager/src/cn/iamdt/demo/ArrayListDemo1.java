package cn.iamdt.demo;

import cn.iamdt.domain.Student;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        Student stu1 = new Student("heima001", "张三", 23, "1991-11-11");
        Student stu2 = new Student("heima002", "李四", 24, "1991-11-12");
        Student stu3 = new Student("heima003", "王五", 25, "1991-12-11");

        // 增删改查都是围绕着集合list进行操作
        ArrayList<Student> list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        String id = "heima002";

        int index = getIndex(id, list);
    }

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

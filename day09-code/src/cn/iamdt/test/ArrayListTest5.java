package cn.iamdt.test;

import cn.iamdt.domain.Student;

import java.util.ArrayList;

public class ArrayListTest5 {
    /*
        需求：定义一个方法，方法接收一个集合对象（泛型为Student）
                方法内部将年龄低于18的学生对象找出
                并存入新集合对象，方法返回新集合
     */
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("张三", 23));
        list.add(new Student("李四", 14));
        list.add(new Student("王五", 15));

        ArrayList<Student> newList = filter(list);

        for (int i = 0; i < newList.size(); i++) {
            Student stu = newList.get(i);
            System.out.println(stu.getName() + "---" + stu.getAge());
        }
    }

    private static ArrayList<Student> filter(ArrayList<Student> list) {
        ArrayList<Student> newList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            Student stu = list.get(i);
            if (stu.getAge() < 18) {
                newList.add(stu);
            }
        }
        return newList;
    }
}

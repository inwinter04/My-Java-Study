package cn.iamdt.control;

import java.util.Scanner;

public class ControlDemo {
    public static void main(String[] args) {
        initMenu();
    }

    /*
        需求：学生管理系统-菜单搭建
     */
    public static void initMenu(){
        Scanner sc = new Scanner(System.in);
        lo:     // 标号，给循环取名字，可指定break结束哪一个循环
        while(true){
            System.out.println("请输入您的选择： 1.添加学生 2.删除学生 3.修改学生 4.查看学生 5.退出");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("执行添加学生逻辑...");
                    break;
                case 2:
                    System.out.println("执行删除学生逻辑...");
                    break;
                case 3:
                    System.out.println("执行修改学生逻辑...");
                    break;
                case 4:
                    System.out.println("执行查看学生逻辑...");
                    break;
                case 5:
                    System.out.println("感谢您的使用，再见！");
                    break lo;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }
        }
    }
}

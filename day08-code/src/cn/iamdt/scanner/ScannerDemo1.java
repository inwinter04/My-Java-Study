package cn.iamdt.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入用户名：");
        String name = sc.nextLine();                // nextLine方法以回车键（换行）为结尾获取整行信息
        System.out.println(name);

        System.out.print("请输入密码：");
        String password = sc.next();                // next方法以空格和TAB键为结尾获取信息
        System.out.println(password);

        System.out.println("------------------");

        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.print("请输入个人简介：");
        String content = sc.nextLine();             // 此处存在BUG，上方获取整形数据后内存中还存在换行，nextLine在接受到换行后未录入信息则结束运行
        System.out.println(content);
    }
}

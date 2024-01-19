package cn.iamdt.control;

import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        login();
    }

    /*
        需求：模拟用户登录，一共给三次机会
             假设密码为123456
     */
    public static void login(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入密码");
            int password = sc.nextInt();
            if (password == 123456){
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("登录失败");
            }
        }
    }
}

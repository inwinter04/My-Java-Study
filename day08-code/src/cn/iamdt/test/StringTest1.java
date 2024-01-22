package cn.iamdt.test;

import java.util.Scanner;

public class StringTest1 {
    /*
        需求：模拟用户登录，一共三次机会，登录之后要给出相应的提示
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "123456";

        for (int i = 1; i <= 3; i++) {
            System.out.print("请输入用户名：");
            String inputUsername = sc.nextLine();

            System.out.print("请输入密码：");
            String inputPassword = sc.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 3) {
                    System.out.println("今日机会已用完，明天再来吧！");
                } else {
                    System.out.println("登录失败，您还剩余" + (3 - i) + "次机会");
                }
            }
        }
    }
}

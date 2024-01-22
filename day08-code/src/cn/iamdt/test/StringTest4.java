package cn.iamdt.test;

import java.util.Scanner;

public class StringTest4 {
    /*
        需求：屏蔽敏感词(TMD)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入：");
        String content = sc.nextLine();
        content = content.replace("TMD", "***");
        System.out.println(content);
    }
}

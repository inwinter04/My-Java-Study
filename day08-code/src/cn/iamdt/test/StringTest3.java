package cn.iamdt.test;

import java.util.Scanner;

public class StringTest3 {
    /*
        需求：完成手机号屏蔽功能
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个手机号：");
        String phoneNumber = sc.nextLine();

        String beforeNum = phoneNumber.substring(0, 3);
        String afterNum = phoneNumber.substring(7);

        String finalNum = beforeNum + "****" + afterNum;

        System.out.println(finalNum);
    }
}

package cn.iamdt.test;

import java.util.Scanner;

public class StringBuilderTest1 {
    /*
        需求：从键盘接收一个字符串，判断它是否为对称字符串(回文字符串)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入：");
        String s = sc.nextLine();

        String s1 = new StringBuilder(s).reverse().toString();

        if (s.equals(s1)) {
            System.out.println("字符串" + s + "是反转字符串");
        } else {
            System.out.println("字符串" + s + "不是反转字符串");
        }
    }
}

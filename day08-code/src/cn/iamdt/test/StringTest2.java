package cn.iamdt.test;

import java.util.Scanner;

public class StringTest2 {
    /*
        需求：统计录入文本中包括多少大写字母/小写字母/数字
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;

        System.out.print("请输入你要统计的字符：");
        String s = sc.nextLine();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                countUpper++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                countLower++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                countNumber++;
            }
        }

        System.out.println("该字符串中存在" + countUpper + "个大写字母、" + countLower + "个小写字母、" + countNumber + "个数字");
    }
}

package com.iamdt.test;

import java.util.Random;

public class Test7 {
    /*
        Java实现验证码的生成
     */
    public static void main(String[] args) {
        /*
        char[] chs = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                '1', '2', '3', '4', '5', '6', '7', '8', '9'
        };
         */
        char[] chs = getChars();

        String checkCode = getCheckCode(chs);

        System.out.println("验证码：" + checkCode);
    }

    private static char[] getChars() {
        int index = 0;
        char[] chs = new char[26 + 26 + 10];

        for (char i = 'a'; i <= 'z'; i++){
            chs[index] = i;
            index++;
        }

        for (char i = 'A'; i <= 'Z'; i++){
            chs[index] = i;
            index++;
        }

        for (char i = '0'; i <= '9'; i++){
            chs[index] = i;
            index++;
        }
        return chs;
    }

    private static String getCheckCode(char[] chs) {
        String checkCode = "";

        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int index = r.nextInt(chs.length);
            checkCode += chs[index];
        }
        return checkCode;
    }
}

package com.iamdt.test;

public class Test1 {
    public static void main(String[] args) {
        knockSeven();
    }

    /*
        需求：在控制台打印出1-100符合逢七过规则的数字
     */
    public static void knockSeven(){
        for (int i = 1; i <= 100; i++) {
            int ge = i % 10;
            int shi = i /10 % 10;
            int bai = i / 100;
            if (ge != 7 & shi != 7 & bai != 7 & i % 7 !=0){
                System.out.println(i);
            } else {
                System.out.println("过");
            }
        }
    }
}

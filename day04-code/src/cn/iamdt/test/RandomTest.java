package cn.iamdt.test;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        guessNumber();
    }

    /*
        需求：实现猜数字小游戏
     */
    public static void guessNumber(){
        Random r = new Random();
        int randomNumber = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("猜猜我的数字是什么：");
            int scNumber = sc.nextInt();
            if (randomNumber == scNumber){
                System.out.println("回答正确！");
                break;
            } else {
                if (scNumber > randomNumber){
                    System.out.println("你猜的数字太大了");
                } else {
                    System.out.println("你猜的数字太小了");
                }
            }
        }
    }
}

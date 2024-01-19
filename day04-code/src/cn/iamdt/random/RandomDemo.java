package cn.iamdt.random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        randomTest();
    }

    /*
        需求：利用random产生随机数
     */
    public static void randomTest(){
        Random r = new Random();
        int num = r.nextInt(10);
    }
}

package com.iamdt.demo;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        String[] sArr = {"馒头","面条","面包","米饭"};

        Random r = new Random();
        int i = r.nextInt(sArr.length);

        System.out.println(i);
        System.out.println(sArr[i]);
    }
}

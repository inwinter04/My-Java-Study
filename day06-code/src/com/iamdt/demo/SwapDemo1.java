package com.iamdt.demo;

public class SwapDemo1 {
    /*
        思路：只要涉及到数据交换就要联想到第三方变量
            int a = 10;
            int b = 20;

            int c = a;
            a = b;
            b = c;

            System.out.println("a=" + a);      // 20
            System.out.println("b=" + b);      // 10
     */
    /*
        方法二：面试题，在不使用第三方变量的情况下对数据进行交换

                异或特性：
                    1. 异或是一种基于二进制的位运算，其运算法则是对运算符两侧数的每一个二进制位，同值取0，异值取1
                    2. 异或两次会变成原值
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a ^ b;      // a = 10 ^ 20
        b = a ^ b;      // b = (10^20) ^ 20 = 10
        a = a ^ b;      // a = (10^20) ^ 10 = 20

        System.out.println("a=" + a);      // 20
        System.out.println("b=" + b);      // 10
    }
}

package com.iamdt.test;

import java.util.Scanner;

public class Test4_1 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你想查找的数值：");
        int num = sc.nextInt();
        int index = getIndex(num, arr);
        System.out.println(index);
    }

    /*
        需求：查找元素在数组中的索引位置
                查找元素在数组中第一次出现的索引位置
     */
    public static int getIndex(int num, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}

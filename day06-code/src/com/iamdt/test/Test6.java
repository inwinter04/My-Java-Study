package com.iamdt.test;

import java.util.Scanner;

public class Test6 {
    /*
        需求：6位评委进行打分，去掉一个最高分去掉一个最低分，计算四位评委的平均成绩
     */
    public static void main(String[] args) {
        int[] score = initScore();
        double avg = getAvg(score);
        System.out.println("最终成绩为：" + avg);
    }

    private static int[] initScore() {
        int[] score = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print("请输入第" + (i+1) + "位评委分数：");
            score[i] = sc.nextInt();
            if (score[i] < 0 || score[i] > 100){
                System.out.println("输入有误，请重新输入！");
                i--;
            }
        }
        return score;
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static double getAvg(int[] arr){
        int sum = getSum(arr);
        System.out.println("总成绩为：" + sum);

        int max = getMax(arr);
        int min = getMin(arr);
        sum = sum - max -min;

        return (double) sum / (arr.length-2);
    }
}

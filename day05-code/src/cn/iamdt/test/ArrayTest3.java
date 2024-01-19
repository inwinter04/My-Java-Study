package cn.iamdt.test;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = initArrayFromScanner();

        int max = getMax(arr);
        System.out.println("班级最高分为：" + max);

        int min = getMin(arr);
        System.out.println("班级最低分为：" + min);

        System.out.println("-------------------");

        int[] randomNums = initArrayFromRandom();

        int min1 = getMin(randomNums);
        System.out.println("随机数组中的最小值为：" + min1);
    }

    private static int[] initArrayFromRandom() {
        Random r = new Random();
        int[] randomNums = new int[10];
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = r.nextInt(100) + 1;
        }
        return randomNums;
    }

    private static int[] initArrayFromScanner() {
        // ctrl + alt + m 抽取方法的快捷键
        Scanner sc = new Scanner(System.in);
        System.out.println("键盘录入学生成绩，请输入班级人数：");
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i+1) + "个学生成绩");
            int num = sc.nextInt();
            arr[i] = num;
        }
        return arr;
    }

    /**
     * 获取数组中的最大值
     */
    public static int getMax(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max){
                max = arr[i];
            }
        }

        return max;
    }

    /**
     * 获取数组中的最小值
     */
    public static int getMin(int[] arr){
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min){
                min = arr[i];
            }
        }
        return min;
    }
}

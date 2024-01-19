package cn.iamdt.test;

public class ArrayTest4 {
    /*
        二维数组的遍历操作
            1. 遍历二维数组获取到每一个一维数组
            2. 继续遍历一维数组获取到具体的元素
     */
    public static void main(String[] args) {
        int[][] arr = {
                {11,22,33},
                {44,55,66}
        };

        printArray(arr);

        int sum = getSum(arr);
        System.out.println("遍历二维数组并求和结果为：" + sum);
    }

    /**
     * 遍历打印出二维数组中的元素
     */
    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            // arr[i]是一维数组
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    /**
     * 遍历二维数组并求和
     */
    public static int getSum(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}

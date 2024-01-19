package cn.iamdt.test;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = {100,50,20,90,90};

        int max = getMax(arr);
        System.out.println("数组中最大值为" + max);

        int min = getMin(arr);
        System.out.println("数组中最小值为" + min);

        int sum = getSum(arr);
        System.out.println("数组求和结果为：" + sum);

        double average = getAvg(arr);
        System.out.println("数组平均数为：" + average);

        int count = getCount(arr);
        System.out.println("低于数组平均数的元素个数为：" + count);
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

    /**
     * 对数组进行求和操作
     */
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 数组求平均值
     */
    public static double getAvg(int[] arr){
        int sum = getSum(arr);
        double average = (double)sum / arr.length;
        return average;
    }

    /**
     * 统计低于平均值的元素个数
     */
    public static int getCount(int[] arr){
        int count = 0;
        double average = getAvg(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average){
                count ++;
            }
        }
        return count;
    }
}

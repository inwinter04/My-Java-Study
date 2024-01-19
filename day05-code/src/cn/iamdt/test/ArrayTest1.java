package cn.iamdt.test;

public class ArrayTest1 {
    public static void main(String[] args) {
        getSum();
    }

    public static void printArray(){
        int[] arr = {11,22,33,44,55};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void getSum(){
        int[] arr = {11,22,33,44,55,66,77,88,99};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}

package com.iamdt.demo;

public class SwapDemo3 {
    /*
        需求：数组元素整体翻转
     */
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};

        // reverseArray1(arr);

        /*
            使用两个指针对数值进行反转
         */
        reverseArray2(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void reverseArray2(int[] arr) {
        for (int start = 0, end = arr.length - 1; start < end; start++, end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    private static void reverseArray1(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[i] ^ arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i] ^ arr[arr.length - 1 - i];
            arr[i] = arr[i] ^ arr[arr.length - 1 - i];
        }
    }
}

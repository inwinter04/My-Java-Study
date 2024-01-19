package com.iamdt.demo;

public class SwapDemo2 {
    /*
        需求：数组的第一个元素和最后一个元素进行反转
     */
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};

        arr[0] = arr[0] ^ arr[arr.length-1];
        arr[arr.length-1] = arr[0] ^ arr[arr.length-1];
        arr[0] = arr[0] ^ arr[arr.length-1];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

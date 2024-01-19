package com.iamdt.test;

public class Test4_2 {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50,19,19};

        int[] result = getIndex(19, arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    /*
        需求：设计一个方法，查找元素在索引中的位置（考虑重复元素问题）
     */

    public static int[] getIndex(int num, int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                count++;
            }
        }

        if (count == 0){
            return new int[]{-1};
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
               result[index] = i;
               index++;
            }
        }
        return result;
    }
}

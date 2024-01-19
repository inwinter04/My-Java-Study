package cn.iamdt.array2;

public class ArrayDemo1 {
    /*
        细节：二维数组在存储一维数组时存储的是一维数组的地址值
     */
    public static void main(String[] args) {
        int[][] arr = {
                {11,22,33},
                {44,55,66}
        };

        System.out.println(arr);    // out: [[I@1b6d3586

        System.out.println(arr[0]);    // out: [I@4554617c
        System.out.println(arr[1]);    // out: [I@74a14482

        System.out.println(arr[1][1]);
        System.out.println(arr[0][1]);
    }
}

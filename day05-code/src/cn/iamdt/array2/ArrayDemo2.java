package cn.iamdt.array2;

public class ArrayDemo2 {
    /*
        二维数组动态初始化
     */
    public static void main(String[] args) {
        // 问题：能不能将提前创建好的一维数组存储在二维数组当中？
        int[] arr1 = {11,22,33};
        int[] arr2 = {44,55,66};

        int[][] arr = new int[2][3];
        arr[0] = arr1;
        arr[1] = arr2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    private static void arrayTest1() {
        int[][] arr = new int[2][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}

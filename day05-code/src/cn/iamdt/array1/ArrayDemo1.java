package cn.iamdt.array1;

public class ArrayDemo1 {
    public static void main(String[] args) {
        arrayTest2();
    }

    public static void arrayTest1(){
        // 创建数组方法1:
        int[] array;
        // 创建数组方法2(不常用):
        int array2[];
    }

    public static void arrayTest2(){
        int[] arr = new int[]{11,22,33};
        int[] arr1 = {11,22,33};

        System.out.println(arr1);
    }
}

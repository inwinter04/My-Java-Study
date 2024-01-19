package cn.iamdt.array1;

public class ArrayDemo2 {
    public static void main(String[] args) {
        ArrayTest();
    }

    public static void ArrayTest(){
        int[] arr = {11,22,33,44,55};

        // 取出22元素并且打印在控制台
        System.out.println(arr[1]);

        // 判断数组中第一个元素是奇数还是偶数
        if (arr[0] % 2 == 0){
            System.out.println("数组中第一个元素是偶数");
        } else {
            System.out.println("数组中第一个元素是奇数");
        }

        // 修改数组中第三个元素为66
        arr[2] = 66;
        System.out.println(arr[2]);

        // 根据数组中第四个元素决定打印多少次hello world
        for (int i = 0; i < arr[3]; i++) {
            System.out.println("Hello World");
        }

    }
}

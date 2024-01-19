package cn.iamdt.args;

public class ArgsTest2 {

    /*
        方法的参数传递问题：
            1. 基本数据类型：传递的是数据值
            2. 引用数据类型：传递的是地址值
     */
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        System.out.println("调用change方法前arr[0]的值为：" + arr[0]);
        change(arr);
        System.out.println("调用change方法后arr[0]的值为：" + arr[0]);
    }

    public static void change(int[] arr){
        arr[0] = 66;
    }
}

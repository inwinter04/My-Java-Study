package cn.iamdt.args;

public class AgsTest1_1 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前number的值为：" + number);
        number = change(number);
        System.out.println("调用change方法后number的值为：" + number);
    }

    public static int change(int number){
        number = 200;
        return number;
    }

}

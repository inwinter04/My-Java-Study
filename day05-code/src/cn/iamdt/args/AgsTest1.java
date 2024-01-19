package cn.iamdt.args;

public class AgsTest1 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前number的值为：" + number);
        change(number);
        System.out.println("调用change方法后number的值为：" + number);
    }

    public static void change(int number){
        number = 200;
    }

}

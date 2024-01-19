package cn.iamdt.loop;

public class ForDemo {
    public static void main(String[] args) {
        forTest3();
        forTest4();
    }

    public static void forTest1(){
        for(int i = 1 ; i <= 3 ; i++){
            System.out.println("这是第"+i+"圈");
        }
    }

    public static void forTest2(int n){
        if (n < 1){
            System.out.println("您传入的参数有误，请检查！");
        }else{
            for(int i = 1; i <= n ; i++){
                System.out.println("黑马程序员");
            }
        }
    }

    public static void forTest3(){
        for (int i = 1; i <= 3 ; i++){
            System.out.println(i);
        }
    }

    public static void forTest4(){
        for (int i = 3; i >= 1 ; i--){
            System.out.println(i);
        }
    }
}

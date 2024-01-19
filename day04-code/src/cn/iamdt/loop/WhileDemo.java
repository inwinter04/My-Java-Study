package cn.iamdt.loop;

public class WhileDemo {
    public static void main(String[] args) {
        whileTest();
    }

    public static void whileTest(){
        for(int i = 1 ; i <=5 ; i++){
            System.out.println("黑马程序员");
        }

        System.out.println("---------------");

        int i = 1;
        while (i <= 5){
            System.out.println("黑马程序员");
            i ++;
        }
    }
}

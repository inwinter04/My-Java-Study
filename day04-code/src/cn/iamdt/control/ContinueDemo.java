package cn.iamdt.control;

public class ContinueDemo {
    public static void main(String[] args) {
        print();
    }

    public static void print(){
        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 6 || i == 10){
                continue;
            }
            System.out.println("第"+ i + "位顾客进入电影院...");
        }
    }
}

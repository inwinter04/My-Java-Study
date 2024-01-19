package cn.iamdt.test;

public class LoopTest {
    public static void main(String[] args) {
        getNum();
    }

    public static int getSum(){
        int sum = 0;
        for(int i = 1 ; i <= 100 ; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void getNum(){
        int count = 0;
        for(int i = 100; i <= 999 ; i++){
            int ge = i % 10;
            int shi = i /10 % 10;
            int bai = i / 100;

            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                System.out.println(i);
                count ++;
            }
        }
        System.out.println("总共有水仙花数：" + count);

    }
}

package cn.iamdt.test;

public class WhileTest {
    public static void main(String[] args) {
        getNum();
    }

    /*
        需求：在控制台打印出所有的水仙花数
     */
    public static void getNum(){
//        for(int i = 100; i <= 999; i++){
//            int ge = i % 10;
//            int shi = i / 10 % 10;
//            int bai = i / 100;
//
//            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
//                System.out.println(i);
//            }
//        }
        int i = 100;
        while (i <= 999){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;

            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                System.out.println(i);
            }

            i++;
        }
    }
}

package cn.iamdt.stringbuilder;

public class StringBuilderDemo1 {
    /*
        StringBuilder的作用：提高字符串操作效率
     */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 100000; i++) {
            sb.append(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(sb);

        System.out.println("运行时间为：" + (end - start));           // 运行时间为：12
    }

    private static void method() {
        // currentTimeMillis方法：获取1970年1月1日0时0分到现在所经历过的毫秒值（1秒 = 1000 毫秒）
        long start = System.currentTimeMillis();

        String s = "";

        for (int i = 1; i <= 100000; i++) {
            s += i;
        }

        long end = System.currentTimeMillis();

        System.out.println(s);

        System.out.println("运行时间为：" + (end - start));           // 运行时间为：2642
    }
}

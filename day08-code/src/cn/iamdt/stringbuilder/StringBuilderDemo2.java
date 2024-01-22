package cn.iamdt.stringbuilder;

public class StringBuilderDemo2 {
    /*
        StringBuilder特点：
            1. 一个可变的字符序列
            2. StringBuilder是一个字符缓冲区，可以理解是一个容器，这个容器可以存储任意数据类型，但只要进到这个容器，全部变成字符串

        StringBuilder构造方法：
            1. public StringBuilder() : 创建一个字符串缓冲区（容器），其初始容量是16个字符，超过初始容量后会自动扩容
            2. public StringBuilder(String str) : 创建一个字符串缓冲区（容器），容器在创建好后就会带有参数内容
     */
    public static void main(String[] args) {
        method3();
    }

    /**
     * StringBuilder是一个可变的字符序列
     */
    private static void method1() {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        sb.append("红色");
        System.out.println(sb);

        sb.append("绿色");
        System.out.println(sb);

        sb.append("蓝色");
        System.out.println(sb);

        sb.append("黄色");
        System.out.println(sb);
    }

    /**
     * StringBuilder的空参构造方法
     */
    private static void method2() {
        StringBuilder sb = new StringBuilder();
        sb.append("123456789123456789");        // 超过初始容量后会自动扩容
        System.out.println(sb);
    }

    /**
     * StringBuilder的带参构造方法
     */
    private static void method3() {
        StringBuilder sb = new StringBuilder("iamdt");
        System.out.println(sb);
    }
}

package cn.iamdt.string;

public class StringDemo2 {
    /*
        String类常见构造方法
     */
    public static void main(String[] args) {
        // 创建一个空白
        String s1 = new String();
        System.out.println(s1);

        // 通过传入字符数组，创建字符串对象
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println(s2);

        // 通过传入字符串来创建字符串对象
        String s3 = new String("abc");
        System.out.println(s3);

    }
}

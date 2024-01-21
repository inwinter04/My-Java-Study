package cn.iamdt.string;

public class StringDemo1 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s.toUpperCase());

        /**
         * 字符串常量池：如果字符串不存在则创建新的对象。若存在，则复用原有的对象。
         */
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2);           // 结果为：True
    }
}

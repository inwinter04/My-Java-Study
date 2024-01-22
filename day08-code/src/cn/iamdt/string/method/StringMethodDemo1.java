package cn.iamdt.string.method;

public class StringMethodDemo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s1 == s2);               // false，比较两个变量记录的地址
        System.out.println(s1.equals(s2));          // true，比较两个变量记录的值

        System.out.println("------------------------------");

        String ss1 = "abc";
        String ss2 = "ABC";

        System.out.println(ss1.equals(ss2));                    // false，equals方法要求字符串完全相等
        System.out.println(ss1.equalsIgnoreCase(ss2));          // true，equalsIgnoreCase方法可忽略大小写进行比较
    }
}

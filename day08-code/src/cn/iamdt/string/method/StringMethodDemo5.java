package cn.iamdt.string.method;

public class StringMethodDemo5 {
    /*
        String类的切割
     */
    public static void main(String[] args) {
        String s = "192.60.0.1";

        String[] strings = s.split("\\.");          // 正则表达式匹配.
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}

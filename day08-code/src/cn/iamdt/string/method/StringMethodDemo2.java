package cn.iamdt.string.method;

public class StringMethodDemo2 {
    /*
        String类用于遍历的方法：

            1. public char[] toCharArray 将此字符串转换成字符数组
            2. public char charAt(int index) 返回指定索引处的char值
               public int length() 返回字符串的长度
     */
    public static void main(String[] args) {
        print2();
    }


    /**
     * String类遍历的第一个方法
     */
    private static void print1() {
        String s1 = "iamdt";
        char[] charArray = s1.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }

    /**
     * String类遍历的第二个方法
     */
    private static void print2() {
        String s = "iamdt";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}

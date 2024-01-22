package cn.iamdt.string.method;

public class StringMethodDemo3 {
    /*
        String类的截取（切片）方法
     */
    public static void main(String[] args) {
        String s = "itheima";
        String substring = s.substring(0, 2);   // 包含头不包含尾
        System.out.println(substring);
    }

    private static void method() {
        String s = "itheima";
        String substring = s.substring(2);
        System.out.println(substring);
    }
}

package cn.iamdt.stringbuilder;

public class StringBuilderDemo3 {
    /*
        SpringBuilder常用成员方法
            1. public StringBuilder append(任意值) : 添加数据并返回自己
            2. public StringBuilder reverse : 将缓冲区的内容进行反转
            3. public int length : 返回长度
            4. public String toString :
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // 链式编程：调用的方法返回的结果是对象时，就可以继续调用方法。
        sb.append("红色").append("绿色").append("蓝色");
        System.out.println(sb);

        sb.reverse().append("黄色");
        System.out.println(sb);

        System.out.println(sb.length());

        // 情况：我需要使用String的切割方法但是StringBuilder没有
        // 解决：先使用toString方法转换成String后再调用String的方法
        String[] strings = sb.toString().split("色");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}

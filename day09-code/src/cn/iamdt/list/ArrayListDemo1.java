package cn.iamdt.list;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 步骤1：创建一个集合容器，内部存储 11.1 22.2 33.3
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(11.1);
        list1.add(22.2);
        list1.add(33.3);

        // 步骤2：创建一个集合容器，内部存储 张三，李四，王五
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("张三");
        list2.add("李四");
        list2.add("王五");

        // 步骤3：在控制台展示两个容器的元素
        System.out.println(list1);
        System.out.println(list2);
    }
}

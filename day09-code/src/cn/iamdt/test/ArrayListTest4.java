package cn.iamdt.test;

import java.util.ArrayList;

public class ArrayListTest4 {
    /*
        需求：创建一个存储String的集合，内部存储（test，张三，李四，test，test）字符串
                删除所有的test字符串，删除后，将集合剩余元素打印在控制台
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");

        /**
         * 方法二
         */
        for (int i = list.size() - 1; i >= 0; i--) {
            if ("test".equals(list.get(i))) {
                list.remove(i);
            }
        }

        System.out.println(list);
    }

    /**
     * 方法一
     */
    private static void method1(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if ("test".equals(list.get(i))) {
                list.remove(i);
                i--;                // 若不进行i--会导致漏掉连续的"test"
            }
        }

        System.out.println(list);
    }
}

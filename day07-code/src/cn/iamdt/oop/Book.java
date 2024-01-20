package cn.iamdt.oop;

public class Book {
    String id;
    String name;
    double price;

    public void show() {
        System.out.println("编号：" + id + "\n" + "书名：" + name + "\n" + "价格：" + price + "\n");
    }
}

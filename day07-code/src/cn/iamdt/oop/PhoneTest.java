package cn.iamdt.oop;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "小米";
        phone1.color = "白色";
        phone1.price = 4999;

        Phone phone2 = new Phone();
        phone2.brand = "华为";
        phone2.color = "黑色";
        phone2.price = 6999;

        phone1.call("张三");
        phone1.sendMessage();

        phone2.call("李四");
        phone2.sendMessage();
    }
}

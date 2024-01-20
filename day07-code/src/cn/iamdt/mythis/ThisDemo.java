package cn.iamdt.mythis;

public class ThisDemo {
    /*
        细节：遇到成员变量和局部变量名相同时，Java采用就近原则。

        问题：非要使用成员变量怎么办？
        解决：使用this关键字进行区分

        ----------------------------------------------------------
        this 代表当前类的引用（地址）
                - 谁来调用我，我就代表谁
     */
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "钢门吹雪";
        stu1.sayhello("西域狂鸭");
        System.out.println("----------------------------");
        System.out.println(stu1);
        stu1.print();

        System.out.println("----------------------------");

        Student stu2 = new Student();
        System.out.println(stu2);
        stu2.print();
    }
}

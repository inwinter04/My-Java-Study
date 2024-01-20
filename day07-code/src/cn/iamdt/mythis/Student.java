package cn.iamdt.mythis;

public class Student {
    String name;

    public void sayhello(String name) {
        System.out.println(name);           // 西域狂鸭
        System.out.println(this.name);      // 钢门吹雪         当成员变量与局部变量冲突时为了区分则不可以省略成员变量的this

        this.method();                      // this.本类成员方法 可以直接省略this
    }

    public void method() {
        System.out.println("method...");
    }

    public void print() {
        System.out.println("print方法中打印this关键字 ---→ " + this);
    }
}

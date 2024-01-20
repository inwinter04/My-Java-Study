package cn.iamdt.permissions;

public class PermissionsDemo {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println(stu1.name);  // 可以打印出name的默认值
        // age 在 cn.iamdt.permissions.Student 中是 private 访问控制
        //System.out.println(stu1.age);   //  无法访问，age权限为private
    }
}

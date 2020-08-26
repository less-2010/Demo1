package day05.oop1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scanner.nextLine().trim();
        System.out.println("请输入密码：");
        String passWord = scanner.nextLine().trim();
        //设置一个新用户
        Admin admin = new Admin(name,passWord);
        admin.upDate(admin);
        System.out.println(admin.toString());
    }
}

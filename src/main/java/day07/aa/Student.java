package day07.aa;

import java.util.Scanner;

public class Student {
    //final修饰的常量初始化后不可以改变值
    final int day = 7; //星期天数

    String name = "张三";
    int age=21; //没有使用static修饰的叫做成员变量或者实例变量，通过对象调用
    static int money=100; //类变量 通过类名.类变量调用
    //静态代码块在累加在的时候执行，就执行一次，先执行静态代码块在加载Student()构造方法
    static {
        //能初始化类变量
        money=500;
    }

    public Student(){}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*成员方法*/
    public void show() {
//      day =8; //常量一旦被初始化就不能被修改
        final String company;//局部常量可以不赋值
        /*成员方法能直接调用静态方法或变量*/
        System.out.println(this.name + "\t" + this.age);
    }
    /*静态方法*/
    public static void  showIn(){
        /*静态不能直接使用非静态变量或方法,要先创建对象，通过对象调用*/
        System.out.println(Student.money+"\t");
    }
}


class Test{
    public static void main(String[] args) {
        Student student = new Student();
        //成员方法通对象调用
        student.show();
        System.out.println(student.money);//不推荐对象直接调用类变量
        System.out.println(student.name);
        //静态方法通过类名调用
        Student.showIn();
        //静态变量通过类名调用
        System.out.println(Student.money);
    }
}




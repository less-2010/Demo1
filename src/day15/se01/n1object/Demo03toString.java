package day15.se01.n1object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo03toString {

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        Person p = new Person();
//        Person p = new Person("小明 ",18);
        System.out.println(p.toString());
        System.out.println(p);//直接打印对象名默认调用toString()
        //看一个类是否打印的对象是类文件名全称@哈希码十六进制 来判断是否重写toString
        Random r = new Random();
        System.out.println(r);
//		没重写toString()  类文件名全称@哈希码十六进制

        Scanner scan = new Scanner(System.in);
        System.out.println(scan);
//		重写了toString()
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
//		重写toString()

    }



}

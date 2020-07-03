package day15.se01.n2System;

import java.util.Scanner;

/**
 *
 * java.lang. System类代表运行时系统，提供了一些获取设置和获取当前系统
 * 运行环境的方法:
 * System有三个成员变量:
 * System.in标准输 入流
 * System.out标准 输出流
 * System.err错 误输出流
 * System中的方法:
 * System. currentTimeMillis();//返回以毫秒为单位的当前时间
 * System. arrayCopy(5个参数);//快速复制数组的方法
 * System. exit();//退出Java虛拟机的方法
 *
 */

public class Demo01System {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.in是-一个很原始、很简陋的输入流对象，通常不直接使用它来读取
//        用户的输入。一般封装后再使用。
        System. out . println("标准输出流");
        System. err . println("错误输出流" );
        long start=System. currentTimeMillis();
//        System. currentTimeMillis();//通常用来测试程序效率从1970-1-1-00：00起到当前时间的毫秒数


        for (int i = 0; i <10000 ; i++) {
            System.out.println(i);

        }
        long end = System.currentTimeMillis();
        System.out.println("程序耗时："+(end-start)+"毫秒");


//        System. exit(int status )终止当前正在运行的Java虛拟机。参数的作用
//        根据惯例，非0的状态码表示异常终止
        int a=51;
        for(int i=0;i<100;i++){
            System . out. println(i);
            if(i==a) {
                System.exit(1);
            }

        }



    }
}

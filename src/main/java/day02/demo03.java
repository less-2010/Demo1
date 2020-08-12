package day02;

import java.util.Scanner;

public class demo03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    //9、追尾赋值:相互交换两个变量的值


//    小练习1、输入两个整数，放入到a与b变量中去，
//      如果a>=b就将a与b中的值进行交换，
//      否则就不交换。目地就是要让a中放的值
//	    总是小于或等于b中的数，输出。
//      int a=scan.nextInt();
//      int b=scan.nextInt();


    // if(a>=b){
    //     int c=a;
    //     a=b;
    //     b=c;
    //     System. out. println("a="+a);
    //     System. out. println("b="+b);
    // }
    // else{
    //     System. out. println("a="+a);
    //     System. out. println("b="+b);
       
    // }


//   小练习2、输入三个int型的数据，放入到a,b,c三个变量中去，
//	 使用条件结构与交换逻辑
//    将这三个变量中的值从小到大排列。
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();

    if(a>=b){
        int d=a;
        a=b;
        b=d;}
    if(a>=c){
        int e=a;
        a=c;
        c=e;    
    }
    if(b>=c){
        int f =b;
        b=c;
        c=f;
    }

    System.out.println("a="+a+"b="+b+"c="+c);
    
  
    }
    
        
}

package day04;

import java.util.Scanner;


public class Test1 {
    static Scanner scan = new Scanner(System.in);
    static int num;
    static int num1;
    static int num2; 

    public static void main(String[] args) {
        // 1、mh(num);num表示循环多少次
        num = scan.nextInt();
        mh1(num);

        // 2、mh(x,y);//x，y表从x到y
        // 方法的递归；方法中调用自己
        System.out.println("请输入开始：");
        num1 = scan.nextInt();
        System.out.println("请输入结束：");
        num2 = scan.nextInt();
        mh2(num1, num2);
    }

    // 第一题
    // mh1()
    static void mh1(int i) {
            if(i<=0){
                return;
            }
            System.out.println(i);
            mh1(--i);
        }
        
    // 第一题
    // mh2()
    static void mh2(int i,int j) {
            if (i>j)return; 
               System.out.println("我的小鱼你醒了"+i);
            mh2(++i,j);


    }         
}
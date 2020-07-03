package day03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //数组练习:
//  练习1、请将”我” “爱” “你”存入数组，然后正着和反着输出
        // String str[] = {"我","爱","你"};
        // for (int i = 0; i < str.length; i++) { 
        //     System.out.print(str[i]+" ");
            
        // }
        // System.out.println();
        // for (int j = 2; j>=0; j--) {
        //     System.out.print(str[j]+" ");
        // }
      
 
 
//  练习2、随机产生10个[0,100)整数存入数组a，
//  使用Arrays.toString()输出a，然后复制到b数组中，
//      再使用Arrays.toString()输出b
        // int []a = new int[10];
        // int []b = new int[10];

        // for (int i = 0; i < a.length; i++) {
        //     a[i]= (int)(Math.random()*100);
        //     for (int j = 0; j < a.length; j++) {
        //         b[j]=a[i];
        //     }
        // }
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(a));



//  练习3、随机产生10个[0,100)整数存入数组，
//  然后将每个数+3后复制到b2数组中输出
        // int []a2 = new int[10];
        // int []b2 = new int[10];

        // for (int i = 0; i < a2.length; i++) {
        //     a2[i]= (int)(Math.random()*100);

        // }
        // for (int j = 0; j < a2.length; j++) {
        //     b2[j]=a2[j]+3;
            
        // }
        // System.out.println(Arrays.toString(a2));
        // System.out.println(Arrays.toString(b2));



//  练习4、随机产生10个[0,100)整数存入数组，
//  然后每个数，若为奇数乘以2、若为偶数则加上自身的一半后，复制到B数组中输出。
        int []a3 = new int[10];
        int []b3 = new int[10];

        for (int i = 0; i < a3.length; i++) {
            a3[i]= (int)(Math.random()*100);
           
        }
        System.out.print("数组a3：");
        System.out.println(Arrays.toString(a3));
        for (int i = 0; i < a3.length; i++) {
			if(a3[i]%2==0) {
				b3[i]=a3[i]+a3[i]/2;
			}
			else{
				b3[i]=a3[i]*2;
			}
		}
		System.out.print("数组b3：");
		System.out.println(Arrays.toString(b3));


//  练习5、声明一个int型的数组，循环接收8个学生的
//  成绩，计算这8个学生的总分
//         及平均分、最高分和最低分。

        // Scanner scan = new Scanner(System.in);
        // double max = 0;
        // double pj;
        // double sum = 0;
        // double min = 100;
        // int score[]= new int[8];
        // for(int j=0;j<score.length;j++) {
        //     System.out.print("请输入第"+(j+1)+"学生的成绩：");
        //     score[j]=scan.nextInt();
        //     if(score[j]>=max) {
        //         max = score[j];
        //     }
        //     if(score[j]<=min) {
        //         min = score[j];
        //     }
        //     sum = sum+ score[j];
        // }
        // pj = sum / (score.length);
        // System.out.println("最高分："+max);
        // System.out.println("最低分："+min);
        // System.out.println("平均分："+pj);




//      练习6、定义一个长度为10的整型数组，循环输入
//  10个整数。 然后输入
//  一个整数，查找此整数，找到输出下标，没找到
//  给出提示。

        // Scanner scann = new Scanner(System.in);
        // int num[]= new int[8];
        // for(int j=0;j<num.length;j++) {
        //     System.out.print("请输入第"+(j+1)+"个整数：");
        //     num[j]=scan.nextInt();
        // }
        // System.out.print("你要查找的数是：");
        // int cz = scann.nextInt();
        // int jj=0;
        // for(int j=0;j<num.length;j++) {
        //     if(cz == num[j]) {
        //         System.out.println("查找下标为："+ j);
        //         jj=1;
        //     }
        // }
        // if(jj==0) {
        //     System.out.println("没找找哦！宝贝");
        // }
        // scan.close();


    }
    
}
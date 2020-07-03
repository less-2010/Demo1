package day02;


import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

// 练习1：求1+2+3+……+100的和，使用while循环
	// int num=0;
	// int sum=0;
	// while(true){
	//     num++;
	//     sum=sum+num;
	//     if(num>100)break;
	//     System.out.println(sum); }

// 练习2：依次输入一组正整数，输入0结束输入，计算出最大值，并输出。
  Scanner scan = new Scanner(System.in);

		int []in={};
		int max1=0;
		
		while(true){
			int i=0;
			i++;
			System.out.println("请输入数字：");
				in[i] = scan.nextInt();
				if(in[i]<in[i+1]) {
					max1=in[i];
					in[i]=in[i+1];
					in[i+1]=max1;
				}

				System.out.println(max1);     
				if(in[i]==0)break;  
		}
// 练习3：依次输入班级学生的成绩[0,100]，输入-1时结束输入，计算班级学员中最高分、最低分和平均分，并输出。
        float max = 0;
		float min = 100;
		float num = 0;//成绩
		float ave = 0;//平均值
		float sum = 0;//总成绩
		int x = 0;//输入次数
		while(true) {
			System.out.print("输入成绩：");
			
			num = scan.nextFloat();
			if(num != -1) {
				if(num>max) {
					max = (int)num;
				}
				if(num<min) {
					min = (int)num;
				}
				sum = (int) (num + sum);
				x++;
			}else {
				ave = sum / x;
				break;
			}

		}
		System.out.println("最大值为：" + max);
		System.out.println("最小值为：" + min);
		System.out.println("平均值为：" + ave);

    }
}   

    

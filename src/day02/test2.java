package day02;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 练习2：依次输入一组正整数，输入0结束输入，
		// 计算出最大值，并输出。
        int MAX = 0;
		while(true) {
			System.out.print("输入一个整数：");
			
			int num = scan.nextInt();
			if(num>MAX) {
				MAX = num;
			}
			if(num == 0) {
				break;
			}
		}
        System.out.println("最大值为：" + MAX);
        scan.close();

    }
    
}
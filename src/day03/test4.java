package day03;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {


//练习1：手算：表达式5.3+(int)(8.5+4.6)/3%4的值是( )。
    //5.3+13/4=8.55

//练习2：手算：执行语句int a, b, c; a=1; b=3; c=(a+b>3 ? ++a : b++);后，b的值为( 3)。
        //c==true
//练习3：手算：表达式(int)((double)(3)/2)的值是(1 )。
    //(double)(3)==3.0
    //3.0/2==1.5
//练习4：手算：若已初始化int型变量a，b和c，则当a是b和c的公倍数时为true的逻辑表达式是(a=b*c ? true:false)。
//练习5：手算：若已初始化int型变量a，b和c，则当a是b和c的公约数时为true的逻辑表达式是(b%a==0&&c%a==0? true:false)。
//练习6：手算：表达式19/3*3+19%3的值是(21.9999999 )。

//练习7：编程：循环输出100到200之间所有能被2和3整除的数

//练习8：编程：循环输出200到1000之间，能被5整除、或能被8整除的数
//练习9：编程：循环输入10个整数，统计这10个整数中有多少个偶数
//练习10：编程：计算1990年的1月1到2019年的1月1日之间相隔有多少天。（提示：平年有365天，润年有366天，循环从1990年到2019年结束）
//练习11：编程：计算2019年的1月1日，到2019年的9月1日相隔有多少天。（提示：如果是润年的2月就有29天，平年的2月有28天。1、3、5、7、8、10、12月都有31天，4、6、9、11月都有30天）
        System.out.println("请输入年份：");
        Scanner scan = new  Scanner(System.in);
        
//练习12：编程：输出乘法99表：
// 1*1=1
// 1*2=2   2*2=4
// 1*3=3   2*3=6   3*3=9
// ……
        // System.out.println("--------------------九九乘法表----------------------");
        // for (int i = 1; i < 10; i++) {//控制换行
        //     for (int j = 1; j <= i; j++) {//控制输出乘积
        //         int product = i*j;
        //         System.out.print(i+"*"+j+"="+product+" ");
        //     }
        //     System.out.println();
        // }

}    
}
package day03;
/**
 for 循环练习
 */

public class test02 {
    public static void main(String[] args) {

//        #for循环练习

//  练习1：顺序、倒序输出1~10,中间以空格隔开
        // 1 2 3 ……10 10 9 8 ……1
            
        // for (int i = 1; i < 11; i++) {
            
        //     System.out.print(i+" ");
        //     }
        //     System.out.print("   ");

        // for (int j = 10; j >0; j--) {
        //     System.out.print(j+" ");
        // }    
        
   
//  练习2：求1~100的偶数和。
        // int sum = 0;
        // for(int i = 1;i<100;i++){
        //     if(i%2==0){
        //         sum = i+sum;
        //         System.out.println(i); 
        //     }   
        // } 
        // System.out.println(sum); 
//  练习3：计算并输出1-3+5-7+……-99+101的值。
       
        // int sumA = 0 ;
        // int sumB = 0 ;
        // int sum = 0 ;
        // for( int i = 1 ; i <= 101 ; i = i+4 ) {
        //     sumA = sumA +i  ;//将正数累加
        // }
        // for (int x = 3 ; x <= 101 ;x = x+4) {
        //     sumB = sumB - x;//将负数累计
        //     }
        // sum = sumA + sumB ;//正数和负数总计
        // System.out.println(sum);


//  练习4：输出[10,99]之间整数每位数的乘积大于每位数
        //  的和的数。例如：99:9*9=81 > 9+9=18。  提示： %
        //  69%10=9，(69-(69%10))/10
        // for (int i = 10; i <=99; i++) {
	// 		int ge=i%10;//个位
	// 		int shi=i/10;//十位
	// 		if(ge*shi>(ge+shi)) {
	// 			System.out.println(i+":"+shi+"*"+
	// 		ge+"="+(shi*ge)+">"+shi+"+"+ge+
	// 		"="+(shi+ge));
	// 		}		
        // 	}


//        #for循环嵌套
        
//  练习1：打印由*组成的6行8列的矩形，输出语句，只能有一个星号（*）

        // for(int i=0;i<6;i++){
        //         System.out.print("*");
        //         for (int j = 0; j <7; j++) {
        //                 System.out.print("*");
                        
        //         }System.out.println();

        // }            
 
//  练习2：打印*组成的8行的直角三角形
//        for(int i=0;i<=8;i++){
                
//              for (int j = 0; j<i; j++){
//                      System.out.print("*");
//                 }
//         System.out.println();
//         }  

//  练习3：打印*组成的8行的倒直角三角形
        // for(int i=0;i<8;i++){             
        //         System.out.print("*");
        //         for (int j = 8; j>i+1; j--){
        //                 System.out.print("*");       
        //         }
        //         System.out.println();
        // } 

//  练习4：打印*组成的8行的等腰三角形
        // int row=8;
        // for(int i=1;i<=row;i++){
                
                
        //         for (int j=8; j>(i+2)/2; j--){
        //         //控制空格    
        //                 System.out.print(" ");

        //         }
        //         for(int k=1;k<=2*i-1;k++){
        //         //控制*              
        //                 System.out.print("*");
        //         }
        //         //控制换行
        //         System.out.println();   
        // }  
        
//  练习5：打印*组成的8行的倒等腰三角形
        // for (int i = 0; i < 8; i++) {
        //         for (int j = 0; j < i; j++) {
        //         System.out.print(" ");
        //         }
        //         for (int j = 0; j < (8 - i) * 2 - 1; j++) {
        //         System.out.print("*");
        //         }
        //         System.out.println();
        // }
  
    }
}

package day02;

import java.util.Scanner;

public class Demo04 {
   
        public static void main(String[] args) {
            
//          6、算法简介:程序执行的流程，有三种基本的逻辑结构:顺序结构、分支

//          6-1、 顺序结构:从上往下，从左往右，依次执行。
//                  6-1-1、API:Scanner: 扫描器:从控制台输入数据
            Scanner scan=new Scanner (System. in);
//          Java文件认识的标识符:关键字、声明了的变量名、
//          java.lang包中的类(核心类)、同包类名
/*
            Demo04 d03=new Demo04( );
            System.out.println("请输入一个字符串");
            String c = scan .next();
            System.out.println("c="+c);
            char ch = c.charAt(0);
            System.out.println(ch);
            char cha = scan.next().charAt(2);//方法连调
            System.out.println(cha);

            System . out . println("请输入一个布尔值: ");
            boolean d=scan. nextBoolean( ) ;
            System. out. println("d="+d);
*/



//          6-2、 分支结构:根据条件决定执行某些语句，而不执行另- -些语句。if_ else，switch_ case

//              6-2-1、if_ else:if
                    // System.out.println("请输入年龄:");  
                    // int age = scan.nextInt();
                    


                    // if (age>0&&age<150){
                    //     if(age<18){
                    //         System.out.println("未成年");
                    //     }else if(age>=18){
                    //         System.out.println("成年");

                    // }else{
                    //     System.out.println("输入错误!!!请重新输入年龄");
                    // }

                    // }

                    //红包小练习
                    

                    // System.out.println("请输入红包:");  
                    // int RE= scan.nextInt();
                    
                // 练习：声明一个int变量RE（RedEnvelope红包），
                // RE>=100输出大红包，
                // 100>RE>=10：中等红包，RE<10：小红包

                    // if (RE>0&&RE<10){
                    //     System.out.println("小红包");
                        
                    // }else if(RE>=10&&RE<100){
                    //     System.out.println("中等红包");

                    // }else if(RE>=100){
                    //     System.out.println("大红包");
                    // }

            // 6-2-3、if_else_if……:多路分支

                    // int s = 75;
                    // if (s >= 90) {
                    //     System.out.println("优秀");
                    // } else if (s >= 80) {
                    //     System.out.println("良好");
                    // } else if (s >= 70) {
                    //     System.out.println("中等");
                    // } else if (s >= 60) {
                    //     System.out.println("及格");
                    // } else {
                    //     System.out.println("不及格");
                    // }

            // 6.3、switch_case分支
                    // int num = 6;
                    // switch (num) {
                    // case 1:
                    // System.out.println("代码1");
                    // break;
                    // case 2:
                    // System.out.println("代码2");
                    // break;
                    // case 3:
                    // System.out.println("代码3");
                    // break;
                    // default:
                    // System.out.println("默认");
                    // }
                    // System.out.println("结束");

                // 练习：根据输入的月份，输出季节。
                // 345春天，678夏天，9 10 11 秋天， 12 1 2 冬天  \
                System.out.println("请输入当前月份:"); 
                    int num = scan.nextInt();
                    switch (num) {
                    case 1:case 2: case 12:
                    System.out.println("冬天");
                    break;
                   
                    case 3: case 4: case 5:
                    System.out.println("春天");
                    break;
                    
                    case 6: case 7: case 8:
                    System.out.println("夏天");
                    break;
                   
                    case 9: case 10: case 11:
                    System.out.println("秋天");
                    break;
                    default:
                    System.out.println("默认");
                    }
                    System.out.println("结束");

                }

            



    
    }

package day02;

import java.util.Scanner;

 
public class Demo02 {
     

  


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //1、使用三目运算符做练习：声明一个变量age(年龄)，赋值为[0,150]之间的
        //任意整数，根据age>=18判断是否成年，若成年则输出“成年”,
        //若未成年则输出“未成年”。
        
        // System.out.println("请输入年龄:");
        // int age = scan.nextInt();
        // if (age>0||age<150){           
        //         System.out.println(age>=18? "成年":"未成年");
        // }else{
        //         System.out.println("输入错误,请重新输入");
        // }
        // scan.close();
        



        //2、控制台输入一个整数，如果这个整数是大于或等于0并且
        //小于或等于100就输出“整数>=0 and 整数<=100”。
        //如果这个整数大于100就输出“整数>100”，
        //其它的数就输出“整数<0”。
        /*
        System.out.println("请输入整数:");
        int num = scan.nextInt();
        if (num>=0&&num<=100){
            System.out.println("整数>=0 and 整数<=100");
        }
        else if(num>100){
                System.out.println("整数>100");
        }else{
                System.out.println("整数<0");
            }
        
        scan.close();
        }
        */ 
        //3、声明一个变量n，赋值为任意三位数的整数，将其
        //每个位上的数字分别输出在控制台。
        //例如：531，则分别输出5、3、1。
        
        // System.out.println("请输入3个整数数字:");
        // String  num = scan.next();
        //     System.out.println(num.charAt(0));
        //     System.out.println(num.charAt(1));
        //     System.out.println(num.charAt(2));
        // scan.close();
        

        


        //4、声明一个变量year（年），赋值为任意整数代表年份，
        //如果这个整数能被4整除但不能被100整除，或者能被400整数，
        //就输出这一年是润年，否则就输出这一年是平年。
        /*
        System.out.println("请输入年份:");
        int year = scan.nextInt();
        if ((year%4==0&&year%100!=0)||year%400==0) {
            System.out.println("这一年是闰年");
            
        }else{
            System.out.println("这一年是平年");
        }
        scan.close();
        */



        //5、标准体重：
        //男士体重=身高-100±3
        //女士体重=身高-110±3
        //输入性别、身高、体重，查看体重是否标准。
        //分别输出“偏胖”、“偏瘦”、“标准体重”。
        
        System.out.println("请输入性别:");
        String sex = scan.next();
        // if(sex.equals("男")==false||sex.equals("女")==false){
        //     System.out.println("请重新输入性别");
        //     System.exit(0);           
        // }
      
        System.out.println("请输入体重:(千克)");
        int weight = scan.nextInt();
        System.out.println("请输入身高:(cm)");
        int height = scan.nextInt();
        int i = height-100;
        int v = height-110;
        if(sex.equals("男")){
            
            if(weight>=i-3&&weight<=i+3){
                System.out.println("标准体重");
            }else if(weight<i-3){
                System.out.println("体重偏瘦");

            }else{
                System.out.println("体重偏胖");
            }
        }else if(sex.equals("女")){
            if(weight>=v-3&&weight<=v+3){
                System.out.println("标准体重");
            }else if(weight<v-3){
                System.out.println("体重偏瘦");

            }else{
                System.out.println("体重偏胖");
            }               
        }
        else{
            System.out.println("性别输入错误");
            System.exit(0);
        }
    scan.close();
    
    //6、到商场去购买商品，
        //首先购买了一台电视机，请输入电视机的价格。
        //然后又购买了一个冰箱，请输入冰箱的价格。最后交钱。
        //如果总价格小于1000元就不打折，
        //如果总价格大于或等于1000小于5000元就打9折，
        //如果总价格大于或等于5000元小于10000元就打8折,
        //如果总价格大于10000元就打7折。输出最后需要多少元。
        /*
        System.out.println("请输入电视价格:");
        float price1 =scan.nextFloat();
        System.out.println("请输入冰箱价格:");
        float price2 = scan.nextFloat();
        float price = price1+price2;
        if (price<1000){
            System.out.println("不打折！");

        }else if(price>=1000||price<5000){
            System.out.println("打九折");
        }else if(price>=5000&&price<10000){
            System.out.println("打八折");

        }else{
            System.out.println("打七折");
        }

        */

    
    }
        
}
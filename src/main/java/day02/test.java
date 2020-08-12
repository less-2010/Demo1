package day02;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        case04();}
       // Scanner scan = new Scanner(System.in);

        //1、现在有一个银行保险柜，有两道密码。
        // 想拿到里面的钱必须两次输入的密码都要正确。
        // 如果第一道密码都不正确，那直接把你拦在外面；
        // 如果第一道密码输入正确，才能有权输入第二道密码。
        // 只有当第二道密码也输入正确，才能拿到钱！
        // 密码通过控制台输入进行设置

        //设置密码
        // System.out.print("请设置密码1:");
        // String  pwd1 = scan.next();
        // System.out.print("请设置密码2:");
        // String  pwd2 = scan.next();
        // if(pwd1!=""&pwd2!=""){
        //     System.out.println("密码设置成功");
        // }else{
        //     System.out.println("请重新设置密码");
        // }
        // //使用
        // System.out.print("请输入第一道密码:");
        // String user1_pwd = scan.next();
        // if(pwd1.equals(user1_pwd)){
        //     System.out.println("第一道密码输入正确");
        //     System.out.print("请输入第二道密码:");
        //     String user2_pwd = scan.next();
        //     if (pwd2.equals(user2_pwd)){
        //         System.out.println("第二次密码输入正确");
        //         System.out.println("获得大量金钱");
        //     }else{
        //         System.out.println("第二次密码错误,自动退出");
        //         System.exit(1);
        //     }

        // }else{
        //     System.out.println("第一道密码输入错误,自动退出");
        //     System.exit(0);
        // }
        // scan.close(); 







        //2、和电脑抛骰子：
        //程序一启动，产生如下文字：“电脑已经抛了骰子，你决定抛你的骰子吗？”
        //然后等你输入true或false,若输入true，则输出如下文字：
        //“你已经抛了骰子，第1个骰子X(1~6随机，后同)点，第2个骰子X点，总共X点。”
        //“电脑第1个骰子X点，第2个骰子X点，总共X点” 然后根据电脑和你的骰子的总
        //点数的大小，输出“你赢了电脑输了”或“你输了电脑赢了”。
        //若输入false，则输出“你弃权，你输了电脑赢了”。
        // System.out.println("电脑已经抛了骰子，你决定抛你的骰子吗?");

        // // String input = scan.next(); 
        // boolean input = scan.nextBoolean();

        // if(input==true){
        //     int num1 = (int)(Math.random()*(6-1)+1);
        //     int num2 = (int)(Math.random()*(6-1)+1);
        //     int num_u = num1+num2;
        //     System.out.println("你已经抛了骰子，第1个骰子"+num1+"点，第2个骰子"+num2+"点，总共"+num_u+"点");
        //     int num3 = (int)(Math.random()*(6-1)+1);
        //     int num4 = (int)(Math.random()*(6-1)+1);
        //     int num_c = num3+num4;
        //     System.out.println("电脑抛的第1个骰子"+num3+"点，第2个骰子"+num4+"点，总共"+num_c+"点");
        //     System.out.println(num_c>num_u? "你输了电脑赢了":"电脑输了你赢了");
        // }else if(input==false){
        //     System.out.println("你弃权，你输了电脑赢了"); 

        // }
        


        //3、和电脑猜拳：
        //（1）程序一启动，显示“电脑已经猜拳，你也开始猜拳吗？（
        // 0.石头，1.布，2剪刀。）”然后等着用户输入一个整数。
        //（2）然后根据电脑产生的猜拳和用户输入的猜拳输出：“电脑
        // 的猜拳是X，你的猜拳是X，电脑（或你）赢了（平局）。”
        //（3）如果用户输入的不是0、1、2，则输出“你弃权，电脑赢了”
        //  *、赢的规则：石头>剪刀>布>石头

        //电脑猜拳
        // int c_num = (int)(Math.random()*(3-1)+1);
        // System.out.println("电脑已经猜拳，你也开始猜拳吗？(0.石头，1.布，2剪刀。)");
        // int u_num = scan.nextInt();
        // switch (c_num) {
        //     case 0:case 1: case 2:
        //     if (u_num>c_num){
        //         System.out.println("电脑猜得拳是"+c_num+"你的猜拳是"+u_num+"电脑赢了");
        //     }else if (u_num==c_num){
        //         System.out.println("电脑猜得拳是"+c_num+"你的猜拳是"+u_num+"平局");
        //     } else{
        //         System.out.println("电脑猜得拳是"+c_num+"你的猜拳是"+u_num+"你赢了");
        //     }   
        //     break;
        
        //     default:
        //         break;
        // }

        // System.out.println("电脑猜得拳是"+c_num+"你的猜拳是");


	/*
	 4、和电脑比十点半
	  	有一副扑克牌，剔除大小王共52张。程序一启动，输出：
		"电脑摸了第1张牌，你摸的第1张牌是X(扑克牌A~10及JQK随机,后同)"。
		然后输出“电脑摸了第2张牌”或“电脑放弃摸第2张牌”，“你要摸第2张牌吗？”。
		如果输入true则输出“你摸的第2张牌是X”，false则继续往后进行。
		然后输出“电脑摸了第3张牌”或“电脑放弃摸第3张牌”，“你要摸第3张牌吗？”。
		如果输入true则输出“你摸的第3张牌是X”，false则继续往后进行。
		最后根据牌的情况输出"电脑的牌分别是XXX(或XX或X），总点数是X。”
		"你的牌分别是XXX(或XX或X），总点数是X。”
		“你赢了电脑输了”或“电脑赢了你输了”或“平局”。
		1、输赢规则：A~10以牌面记录点数，JQK为半点,
		在总点数不超过十点半的前提下，总点数多的赢。
		2、注意：每种牌在一副扑克牌中只有4张，不能超过。
		（该注意事项可阶段性忽略，之后再完善）
		3、电脑摸牌策略自拟，今后可就摸牌策略的优越性进行测试。
	*/
	 
	public static void case04() {
		double per1,per2,per3;//定义3个数为人3次随机产生的值
		per1=(int)(Math.random()*13+1);
		String s1;
		if(per1==11) {
			s1="J";
		}else if(per1==12) {
			s1="Q";
		}else if(per1==13) {
			s1="K";
		}else {
			s1=Integer.toString((int)per1);
		}
		System.out.println("电脑摸了第1张牌，你摸的第1张牌是"+s1);
		double a1 = (int)(Math.random()*13+1);//电脑第一次产生的点数
		double a2,a3;
		double sum=a1;
		a1=a1>10?0.5:a1;//将大于10 的值转为0.5
		if(a1 <= 4) {//若第一次小于4则让电脑继续摸牌
			System.out.println("电脑摸了第2张牌,你要摸第2张牌吗？");
			a2 = (int)(Math.random()*13+1);//电脑第2次产生的点数
			a2=a2>10?0.5:a2;
			sum = a1+a2;
		}else {
			a2=0;
			System.out.println("电脑放弃摸第2张牌,你要摸第2张牌吗？");
		}
		boolean bo =new Scanner(System.in).nextBoolean();
		if(bo) {
			per2 = (int)(Math.random()*13+1);
			String s2;
			if(per2==11) {
				s2="J";
			}else if(per2==12) {
				s2="Q";
			}else if(per2==13) {
				s2="K";
			}else {
				s2=Integer.toString((int)per2);
			}
			System.out.println("你摸的第2张牌是"+s2);
		}else {
			per2=0;
		}
		
		if(sum <= 7) {//若前2次的和小于7则让电脑继续摸牌
			System.out.println("电脑摸了第3张牌,你要摸第3张牌吗？");
			a3=(int)(Math.random()*13+1);//电脑第3次产生的点数
			a3=a3>10?0.5:a3;
			sum = sum+a3;
		}else {
			a3=0;
			System.out.println("电脑放弃摸第3张牌,你要摸第3张牌吗？");
		}
		bo =new Scanner(System.in).nextBoolean();
		if(bo) {
			per3 = (int)(Math.random()*13+1);
			String s3;
			if(per3==11) {
				s3="J";
			}else if(per3==12) {
				s3="Q";
			}else if(per3==13) {
				s3="K";
			}else {
				s3=Integer.toString((int)per3);
			}
			System.out.println("你摸的第3张牌是"+s3);
		}else {
			per3=0;
		}
		per1=per1>10?0.5:per1;
		per2=per2>10?0.5:per2;
		per3=per3>10?0.5:per3;
		System.out.println("电脑的牌分别是"+a1+","+a2+","+a3+",总点数是"+sum);
		System.out.println("你的牌分别是"+per1+","+per2+","+per3+",总点数是"+(per1+per2+per3));
		double sum2 = per1+per2+per3;//你的
		double sum3 = a1+a2+a3;//电脑的
		if(sum2>10.5&&sum3>10.5) {
			System.out.println("平局");
			return ;//可以直接结束该方法
		}
		if(sum2>10.5&&sum3<=10.5) {
			System.out.println("你输了");
			return;
		}
		if(sum2<=10.5&&sum3>10.5) {
			System.out.println("你赢了");
			return;
		}
		if(sum2>sum3) {
			System.out.println("你赢了");
		}else if(sum2==sum3) {
			System.out.println("平局");
		}else {
			System.out.println("你输了");
		}
          

    

        
    }
    
}

package day03;


import java.util.Scanner;

/**
 * 吃货联盟订餐管理系统
 *
 * @author rong.zhou
 *
 */
public class OrderingMsg {
    public static void main(String[] args) {
        // 数据主体：一组订单信息
        String[] names = new String[4]; // 订餐人名称
        String[] dishMegs = new String[4]; // 所选菜品
        int[] times = new int[4]; // 送餐时间
        String[] addresses = new String[4]; // 送餐地址
        int[] states = new int[4]; // 订单状态： 0：已预定 1：已完成
        double[] sumPrices = new double[4]; // 总金额

        //初始化2个订单信息
        names[0] = "张晴";
        dishMegs[0] = "红烧带鱼 2份";
        times[0] = 12;
        addresses[0] = "天成路207号";
        sumPrices[0] = 76.0;
        states[0] = 1;

        names[1] = "张晴";
        dishMegs[1] = "鱼香肉丝 2份";
        times[1] = 18;
        addresses[1] = "天成路207号";
        sumPrices[1] = 20.0;


        // 供选择的菜品信息
        String[] dishNames = { "红烧带鱼", "鱼香肉丝", "时令鲜蔬" }; // 菜品名称
        double[] prices = new double[] { 38.0, 20.0, 10.0 }; // 菜品单价
        int[] praiseNums = new int[3];

        Scanner input = new Scanner(System.in);
        int num = -1; // 用户输入0返回主菜单，否则退出系统
        boolean isExit = false; // 标志用户是否退出系统： true:退出系统

        System.out.println("\n欢迎使用“吃货联盟订餐系统”");
        // 循环：显示菜单，根据用户选择的数字执行相应功能
        do {
            // 显示菜单
            System.out.println("****************************");
            System.out.println("1、我要订餐");
            System.out.println("2、查看餐袋");
            System.out.println("3、签收订单");
            System.out.println("4、删除订单");
            System.out.println("5、我要点赞");
            System.out.println("6、退出系统");
            System.out.println("****************************");
            System.out.print("请选择：");
            int choose = input.nextInt(); // 记录用户选择的功能编号
            boolean isAdd = false;  //记录是否可以订餐
            boolean isSignFind = false;  //找到要签收的订单
            boolean isDelFind = false;  //找到要删除的订单
            // 根据用户选择的功能编号执行相应功能
            switch (choose) {
                case 1:
                    // 我要订餐
                    System.out.println("***我要订餐***");
                    for (int j = 0; j < names.length; j++) {
                        if(names[j] == null){  //找到第一个空位置，可以添加订单信息
                            isAdd = true;  //置标志位，可以订餐
                            System.out.print("请输入订餐人姓名：");
                            String name = input.next();
                            // 显示供选择的菜品信息
                            System.out.println("序号" + "\t" + "菜名"+"\t"+"单价");
                            for (int i = 0; i < dishNames.length; i++) {
                                String price = prices[i] + "元";
                                String priaiseNum = (praiseNums[i]) > 0 ? praiseNums[i]
                                        + "赞" : "";

                                System.out.println((i + 1) + "\t" + dishNames[i] + "\t"	+price+"\t"+ priaiseNum);
                            }
                            // 用户点菜
                            System.out.print("请选择您要点的菜品编号:");
                            int chooseDish = input.nextInt();
                            System.out.print("请选择您需要的份数:");
                            int number = input.nextInt();
                            String dishMeg =  dishNames[chooseDish - 1]
                                    +" "+ number + "份";
                            double sumPrice = prices[chooseDish - 1] * number;
                            //餐费满50元，免送餐费10元
                            double deliCharge = (sumPrice>=50)?0:6;

                            System.out.print("请输入送餐时间（送餐时间是10点至20点间整点送餐）:");
                            int time = input.nextInt();
                            while (time < 10 || time > 20) {
                                System.out.print("您的输入有误，请输入10~20间的整数！");
                                time = input.nextInt();
                            }
                            System.out.print("请输入送餐地址：");
                            String address = input.next();

                            //无需添加状态，默认是0，即已预定状态。
                            System.out.println("订餐成功！");
                            System.out.println("您订的是："+dishMeg);
                            System.out.println("送餐时间："+time+"点");
                            System.out.println("餐费："+sumPrice+"元，送餐费"+deliCharge+"元，总计："+(sumPrice+deliCharge)+"元。");

                            //添加数据
                            names[j] = name;
                            dishMegs[j] = dishMeg;
                            times[j] = time;
                            addresses[j] = address;
                            sumPrices[j] = sumPrice+deliCharge;

                            break;
                        }
                    }
                    if(!isAdd){
                        System.out.println("对不起，您的餐袋已满！");
                    }
                    break;
                case 2:
                    // 查看餐袋
                    System.out.println("***查看餐袋***");
                    System.out.println("序号\t订餐人\t餐品信息\t\t送餐日期\t送餐地址\t\t总金额\t订单状态");
                    for(int i=0;i<names.length;i++){
                        if(names[i]!=null){
                            String state = (states[i]==0)?"已预定":"已完成";
                            String date = times[i]+"日";
                            String sumPrice = sumPrices[i]+"元";
                            System.out.println((i+1)+"\t"+names[i]+"\t"+dishMegs[i]+"\t"+date+"\t"+addresses[i]+"\t"+sumPrice+"\t"+state);
                        }
                    }
                    break;
                case 3:
                    // 签收定单
                    System.out.println("***签收定单***");
                    System.out.print("请选择要签收的订单序号：");
                    int signOrderId = input.nextInt();
                    for(int i=0;i<names.length;i++){
                        //状态为已预定，序号为用户输入的订单序号：可签收
                        //状态为已完成，序叼为用户输入胡订单序号：不可签收
                        if(names[i]!=null && states[i]==0 && signOrderId==i+1){
                            states[i] = 1; //将状态值置为已完成
                            System.out.println("订单签收成功！");
                            isSignFind = true;
                        }else if(names[i]!=null && states[i]==1 && signOrderId==i+1){
                            System.out.println("您选择的订单已完成签收，不能再次签收！");
                            isSignFind = true;
                        }
                    }
                    //未找到的订单序号：不可签收
                    if(!isSignFind){
                        System.out.println("您选择的订单不存在！");
                    }
                    break;
                case 4:
                    // 删除订单
                    System.out.println("***删除订单***");
                    System.out.print("请输入要删除的订单序号:");
                    int delId = input.nextInt();
                    for(int i=0;i<names.length;i++){
                        //状态值为已完成  序号值为用户输入的序号：可删除
                        //状态值为已预定  序号值为用户输入的序号：不可删除
                        if(names[i]!=null && states[i]==1 && delId==i+1){
                            isDelFind = true;
                            //执行删除操作:删除位置后的元素依次前移
                            for(int j=delId-1;j<names.length-1;j++){
                                names[j] = names[j+1];
                                dishMegs[j] = dishMegs[j+1];
                                times[j] = times[j+1];
                                addresses[j] = addresses[j+1];
                                states[j] = states[j+1];
                            }
                            //最后一位清空
                            names[names.length-1] = null;
                            dishMegs[names.length-1] = null;
                            times[names.length-1] = 0;
                            addresses[names.length-1] = null;
                            states[names.length-1] = 0;

                            System.out.println("删除订单成功！");
                            break;
                        }else if(names[i]!=null && states[i]==0 && delId==i+1){
                            System.out.println("您选择的订单未签收，不能删除！");
                            isDelFind = true;
                            break;
                        }
                    }

                    //未找到该序号的订单：不能删除
                    if(!isDelFind){
                        System.out.println("您要删除的订单不存在！");
                    }
                    break;
                case 5:
                    // 我要点赞
                    System.out.println("***我要点赞***");
                    // 显示菜品信息
                    System.out.println("序号" + "\t" + "菜名"+"\t"+"单价");
                    for (int i = 0; i < dishNames.length; i++) {
                        String price = prices[i] + "元";
                        String priaiseNum = (praiseNums[i]) > 0 ? praiseNums[i]
                                + "赞" : "0赞";

                        System.out.println((i + 1) + "\t" + dishNames[i] + "\t"	+price+"\t"+ priaiseNum);
                    }
                    System.out.print("请选择您要点赞的菜品序号：");
                    int priaiseNum = input.nextInt();
                    praiseNums[priaiseNum-1]++;  //赞数加1
                    System.out.println("点赞成功！");
                    break;
                case 6:
                    // 退出系统
                    isExit = true;
                    break;
                default:
                    //退出系统
                    isExit = true;
                    break;
            }
            if (!isExit) {
                System.out.print("输入0返回：");
                num = input.nextInt();
            } else {
                break;
            }
        } while (num == 0);
        System.out.println("谢谢使用，欢迎下次光临！");
    }
}

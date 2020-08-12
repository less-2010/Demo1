package day03;

import java.util.Scanner;

public class DvdDemo {
    public static void main(String[] args) {

        String[] name = new String[50];   //数组1存储DVD名称数组
        int[] state = new int[50];        //数组2存储DVD借出状态：0已借出/1可借
        String[] date = new String[50];     //数组3存储DVD借出日期
        int[] count = new int[50];

        name[0] = "罗马假日";
        state[0] = 0;
        date[0] = "2013-7-1";

        name[1] = "风声鹤唳";
        state[1] = 1;

        name[2] = "浪漫满屋";
        state[2] = 1;

        int answer;
        do {
            System.out.println("欢 迎 使 用 迷 你 DVD 管 理 器");
            System.out.println("-------------------------------------");
            System.out.println("1. 新 增 DVD");
            System.out.println("2. 查 看 DVD");
            System.out.println("3. 删 除 DVD");
            System.out.println("4. 借 出 DVD");
            System.out.println("5. 归 还 DVD");
            System.out.println("6. 退         出 ");
            System.out.print("--------------------------------------\n");
            System.out.print("请选择： ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("---> 新增DVD\n");
                    System.out.print("请输入DVD名称： ");
                    String dvdname = input.next();
                    for (int i = 0; i < name.length; i++) {
                        if (name[i] == null) {    //查询最后一个空位置插入
                            name[i] = dvdname;
                            state[i] = 1;//置新增的DVD可借状态
                            System.out.println("新增《" + dvdname + "》成功！");
                            break;
                        }
                    }
                    System.out.println("**************************");
                    break;
                case 2:
                    System.out.println("---> 查看DVD\n");
                    System.out.println("序号\t状 态\t名称\t\t借出日期");
                    for (int i = 0; i < name.length; i++) {
                        if (name[i] == null) {
                            break;
                        } else if (state[i] == 0) {
                            System.out.println((i + 1) + "\t已借出\t" + "<<" + name[i] + ">>\t" + date[i]);
                        } else if (state[i] == 1) {
                            System.out.println((i + 1) + "\t可 借\t" + "<<" + name[i] + ">>");
                        }
                    }
                    System.out.println("**************************");
                    break;
                case 3:
                    boolean flag = false;//标识删除成功与否
                    System.out.println("---> 删除DVD\n");
                    System.out.print("请输入DVD名称： ");
                    String deldvdname = input.next();
                    //遍历数组，查找匹配信息
                    for (int i = 0; i < name.length; i++) {
                        //查找到，每个元素前移一位
                        if (name[i] != null && name[i].equalsIgnoreCase(deldvdname) && state[i] == 1) {
                            int j = i;
                            while (name[j + 1] != null) {
                                name[j] = name[j + 1];
                                state[j] = state[j + 1];
                                date[j] = date[j + 1];
                                j++;
                            }
                            //最后一个不为空的元素置空
                            name[j] = null;
                            date[j] = null;
                            System.out.println("删除《" + name + "》成功！");
                            flag = true;//置位，表示删除成功
                            break;
                        } else if (name[i] != null && name[i].equalsIgnoreCase(deldvdname) && state[i] == 0) {
                            System.out.println("《" + deldvdname + "》为借出状态，不能删除！");
                            flag = true;//置位
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("没有找到匹配信息！");
                    }
                    System.out.println("**************************");
                case 4:
                    System.out.print("请输入DVD名称： ");
                    String want = input.next();  //要借出的DVD名称
                    for (int i = 0; i < name.length; i++) {
                        if (name[i] == null) {    //无匹配
                            System.out.println("没有找到匹配信息！");
                            break;
                        } else if (name[i].equals(want) && state[i] == 1) {  //找到匹配可借
                            state[i] = 0;
                            System.out.print("请输入借出日期（年-月-日）：");
                            date[i] = input.next();
                            System.out.println("借出《" + want + "》成功!");
                            count[i]++;
                            break;
                        } else if (name[i].equals(want) && state[i] == 0) {  //找到匹配已被借出
                            System.out.println("《" + want + "》已被借出！");
                            break;
                        }
                    }
                    break;
                case 5:
                    long loan = 0;//租金
                    System.out.print("请输入DVD名称： ");
                    String wantbook = input.next();
                    for (int i = 0; i < name.length; i++) {
                        if (name[i] == null) {    //无匹配
                            System.out.println("没有找到匹配信息！");
                            break;
                        } else if (name[i].equals(wantbook) && state[i] == 0) {  //找到匹配
                            state[i] = 1;
                            System.out.print("请输入归还日期（年-月-日）：");
                            String redate = input.next();
                            break;
                        } else if (name[i].equals(wantbook) && state[i] == 1) { //找到匹配但没有借出
                            System.out.println("该DVD没有被借出！无法进行归还操作。");
                            break;
                        }
                    }
                case 6:
                    System.out.println("\n谢谢 使 用！");
                    break;
            }
            System.out.println("输入0返回输入其他继续：");
            answer = input.nextInt();
        } while (answer != 0);
    }

}

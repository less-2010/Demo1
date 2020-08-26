package day09.oop4.Game;

import java.util.Scanner;

public class Start {
    static int gameCount;
    public static void playGame(){
        Scanner scanner = new Scanner(System.in);
        

        Computer computer = new Computer();
        System.out.println("进入游戏");
        System.out.println("出拳规则：1、石头\t2、 剪刀\t3、布");
        System.out.println("角色选择：1、刘备\t2、 关羽\t3、张飞");
        System.out.println("请选择对方角色:");
        int select = scanner.nextInt();
        if (select==1){
            computer.setName("刘备");
            System.out.println(computer.getName());
        }else if (select==2){
            computer.setName("关羽");
            System.out.println(computer.getName());
        }else if (select==3){
            computer.setName("张飞");
            System.out.println(computer.getName());
        }else {
            System.out.println("输入错误");
        }

        playEr play = new playEr();
        System.out.println("输入你的名字：");
        String playName = scanner.next();
        play.setName(playName);
        String name = play.getName();
        String name1 = computer.getName();
        System.out.println(name+"\tVS\t"+name1);
        
        String flag = "y";
        do {
            Start.gameCount+=1;
            System.out.println("请输入你的选择：");
            int playSkill = play.skill();
            switch (playSkill){
                case 1 :
                    System.out.println("你出石头");
                    break;
                case 2 :
                    System.out.println("你出剪刀");
                    break;
                case 3 :
                    System.out.println("你出布");
                    break;
            }
            int comSkill = computer.skill();
            switch (comSkill){
                case 1 :
                    System.out.println(computer.getName()+"出石头");
                    break;
                case 2 :
                    System.out.println(computer.getName()+"你出剪刀");
                    break;
                case 3 :
                    System.out.println(computer.getName()+"你出布");
                    break;
            }

            if (playSkill>comSkill){
                play.setScore();
            }else if (playSkill<comSkill){
                computer.setScore();
            }
            System.out.println("是否继续？(y/n)");
            flag = scanner.next();
        }while (flag.equals("y"));
    }

    public static void main(String[] args) {
        playGame();
    }
}


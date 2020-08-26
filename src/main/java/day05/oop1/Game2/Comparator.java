package day05.oop1.Game2;

import java.util.Scanner;

public class Comparator {
    private String name;
    private int count;

    public Comparator() {
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        Computer c = new Computer();
        Player p = new Player();
        System.out.println("******************欢迎进入游戏世界****************");
        System.out.println("******************猜拳游戏****************");
        System.out.println("**********************************\n");
        System.out.println("出拳规则：1.石头\t2.剪刀\t3.布");

        System.out.println("请选择对方名字：");
        System.out.println("1.刘备\t2.关羽\t3.吕布");

        System.out.println("请输入你的选择：");
        int i = scanner.nextInt();
        if (i == 1) {
            c.setName("刘备");
        } else if (i == 2) {
            c.setName("关羽");
        } else if (i == 3) {
            c.setName("吕布");
        } else {
            System.err.println("选择错误！！！");
        }

        System.out.println("请输入你的名字：");
        String name = scanner.nextLine().trim();
        p.setName(name);
        System.out.println(c.getName() + "\tVS\t" + p.getName());
        boolean flag = true;


        do {
            count++;
            System.out.println("出拳规则：1.石头\t2.剪刀\t3.布");

            System.out.println("第" + count + "局");
            System.out.print("你出：");
            showInfo(p.skill());
            System.out.print(c.getName() + "出：");
            showInfo(c.Skill());
            int pSkill = p.skill();
            int cSkill = c.Skill();
            if (pSkill == cSkill) {
                continue;
            } else if (pSkill > cSkill) {
                p.addScore();
            } else if (pSkill < cSkill) {
                c.addScore();
            }

            System.out.println("是否继续？（y/n）");
            String t = scanner.nextLine().trim();
            if ("n".equals(t)) {
                break;
            }
        } while (true);

        if (c.getScore()==p.getScore()) {

        }


    }

    public void showInfo(int select){
        if (select==1){
            System.out.println("出石头");
        }
        if (select==2){
            System.out.println("出剪刀");
        }
        if (select==3){
            System.out.println("出布");
        }
    }

}

package day05.oop1.Game;

import java.util.Scanner;

/**
 * 比较器
 */
public class Comparator {
    //游戏次数
    int gameCount;

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        Person p1 = new Person();
        Computer computer = new Computer();
        System.out.println("***********************欢迎进入猜拳游戏****************");
        System.out.println("--------------------------------------------");
        System.out.println("出拳规则：1.石头\t2.剪刀\t3.布");
        boolean flag;
        do {
            flag = false;
            System.out.println("请选择对方角色：1.刘备\t2.孙权\t3.曹操");
            int select = scanner.nextInt();
            if (select == 1) {
                computer.setName("刘备");
            } else if (select == 2) {
                computer.setName("孙权");
            } else if (select == 3) {
                computer.setName("曹操");
            } else {
                System.out.println("输入错误，请重新输入！");
                flag = true;
            }
        } while (flag);

        in(scanner, p1, computer);

    }

    private void in(Scanner scanner, Person p1, Computer computer) {
        System.out.println("请输入你的姓名：");
        String name = scanner.nextLine().trim();
        p1.setName(name);
        System.out.println(p1.name + "\tVS\t" + computer.name);
        System.out.println("要开始了吗？（y/n）");
        String answer = scanner.nextLine().trim();

        while ("y".equals(answer)) {
            gameCount++;
            comparator(p1, computer);
        }
        System.out.println(comparatorAll(p1, computer) + "\n局数：\t" + gameCount + "\n" + p1.name + "的分数:" + p1.getScore() + "\n" + computer.getName() + "的分数:" + computer.getScore());
    }

    public String comparator(Person p, Computer c) {
        String str = null;
        int result1 = p.skill();
        int result2 = c.skill();

        if (result1 == result2) {
            str = "平局";
        }
        if (result1 < result2) {
            c.score += 1;
        }
        if (result1 > result2) {
            p.score += 1;
        }
        return str;
    }

    public String comparatorAll(Person p, Computer c) {
        String str = null;
        int result1 = p.score;
        int result2 = c.score;

        if (result1 == result2) {
            str = "平局";
        }
        if (result1 < result2) {
            str = "电脑赢了";
        }
        if (result1 > result2) {
            str = "你赢了了";
        }
        return str;
    }
}

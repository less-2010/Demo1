package day05.oop1.Game;

import java.util.Scanner;

/**
 * 玩家类
 */
public class Person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    int score;

    public int skill(){
        Scanner scanner = new Scanner(System.in);
       boolean flag ;
        int num;
        do {
            flag = false;
            System.out.println("1.剪刀\t2.石头\t3.布");
            System.out.println("请选择编号：");

            num= scanner.nextInt();

            switch (num) {
                case 1: {
                    System.out.println("你出：剪刀");
                    break;
                }
                case 2: {
                    System.out.println("你出：石头");
                    break;
                }
                case 3: {
                    System.out.println("你出：布");
                    break;
                }
                default:
                    System.out.println("输入错误，请重新输入：");
            }
        }while (flag);
        return num;
    }
}

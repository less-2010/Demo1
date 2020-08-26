package day05.oop1.Game2;

import java.util.Scanner;

public class Player {
    private String name;
    private  int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Player() {
    }

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
    public void addScore() {
        this.score +=1;
    }



    public int  skill(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的选择：");
        int select = scanner.nextInt();

        if (select==1){
            return 1;
        }
        else if (select==2){
            return 2;
        }
        else if (select==3) {
            return 3;
        }return 0;
    }
}

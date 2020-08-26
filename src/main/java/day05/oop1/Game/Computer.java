package day05.oop1.Game;

public class Computer {
    String name;
    int score=0;

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


    public int skill(){
        int num;
            System.out.println("1.剪刀\t2.石头\t3.布");
            num= (int) Math.random()*3+1;
            switch (num) {
                case 1: {
                    System.out.println(name+"：剪刀");
                    break;
                }
                case 2: {
                    System.out.println(name+"：石头");
                    break;
                }
                case 3: {
                    System.out.println(name+"你出：布");
                    break;
                }
                default:
                    System.out.println("输入错误，请重新输入：");
            }
        return num;
    }
}

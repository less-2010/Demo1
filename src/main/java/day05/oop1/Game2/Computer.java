package day05.oop1.Game2;

public class Computer{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public void addScore() {
        this.score += 1;
    }
    int score;

    public Computer(int score) {
        this.score = score;
    }

    public Computer() {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int Skill(){

        int num = (int) Math.random() * 3 +1;
        if (num==1){
            return 1;
        }else if (num==2){
            return 2;
        }else if (num==3){
            return 3;
        }
        return 0;
    }

}

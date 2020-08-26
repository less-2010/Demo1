package day09.oop4.Game;

/**
 * 游戏抽象类
 * @author BING
 * @date 2020/8/21
 */
public abstract class Game {
    private  String name;
    private  int score;

   abstract public int skill();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore() {
        this.score += 1;
    }
}

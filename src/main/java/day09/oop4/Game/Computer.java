package day09.oop4.Game;

/**
 * re类
 * @author BING
 * @date 2020/8/21
 */
public class Computer extends Game {

    @Override
    public int  skill() {
        int s =(int) Math.random() * 3 + 1;
        return s;
    }
}

package day09.oop4.Game;

import java.util.Scanner;

/**
 * 玩家类
 * @author BING
 * @date 2020/8/21
 */
public class playEr extends Game {

    public int  skill() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }
}

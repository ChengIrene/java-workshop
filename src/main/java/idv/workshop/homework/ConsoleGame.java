package idv.workshop.homework;

import java.util.Scanner;

//在文字模式下執行猜數字遊戲
public class ConsoleGame extends GuessGame{
    private Scanner console = new Scanner(System.in);

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public int nextInt() {
        return console.nextInt();
    }
}

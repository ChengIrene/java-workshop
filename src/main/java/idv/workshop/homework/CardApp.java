package idv.workshop.homework;

import java.util.Scanner;

public class CardApp {
    public static void main (String[] args) {
        CashCard[] cards = {
                new CashCard("A001", 500, 0),
                new CashCard("A002", 300, 0),
                new CashCard("A003", 1000, 1),
                new CashCard("A004", 2000, 2),
                new CashCard("A005", 3000, 3)
        };

        Scanner console = new Scanner(System.in);
        for(CashCard card : cards) {
            System.out.printf("為 (%s, %d, %d) 儲值 : ", card.getNumber(), card.getBalance(), card.getBonus());
            card.store(console.nextInt());
            System.out.printf("明細 (%s, %d, %d)%n", card.getNumber(), card.getBalance(), card.getBonus());
        }
    }
}

package idv.workshop.homework;

import org.junit.Test;

public class CardAppTest {

    @Test
    public void testCreate() {
        CashCard[] cards = {
                new CashCard("Suica", 500, 0),
                new CashCard("Passmo", 300, 0),
                new CashCard("Icoca", 1000, 1),
                new CashCard("EasyCard", 2000, 2),
                new CashCard("Kitaca", 3000, 3)
        };

        for(CashCard card : cards) {
            System.out.printf("為 (%s, %d, %d) 儲值 : ", card.getNumber(), card.getBalance(), card.getBonus());
            card.store(1000);
            System.out.printf("明細 (%s, %d, %d)%n", card.getNumber(), card.getBalance(), card.getBonus());
        }
    }
}

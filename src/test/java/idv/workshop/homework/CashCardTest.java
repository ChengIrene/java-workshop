package idv.workshop.homework;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CashCardTest {

    @Test
    public void testCreate() throws CashCard.InsufficientException {
        final String  suica5472OfNumber = "suica5472";
        final int suica5472OfBalance = 1000;
        final int suica5472OfBonus = 10;

        CashCard suica5472 = new CashCard(suica5472OfNumber, suica5472OfBalance, suica5472OfBonus);

        assertEquals(suica5472OfNumber, suica5472.getNumber());
        assertEquals(suica5472OfBalance, suica5472.getBalance());
        assertEquals(suica5472OfBonus, suica5472.getBonus());

        //儲值500
        suica5472.store(500);
        assertEquals(1500, suica5472.getBalance());
        assertEquals(10, suica5472.getBonus());
        //再儲值1000
        suica5472.store(1000);
        assertEquals(2500, suica5472.getBalance());
        assertEquals(11, suica5472.getBonus());

        //扣款1000
        suica5472.charge(1000);
        assertEquals(1500, suica5472.getBalance());

        //兌換紅利點數
        suica5472.exchange(1);
        assertEquals(10, suica5472.getBonus());

        //儲值負數,斷言有顯示出錯誤的訊息
        suica5472.store(-100);

        //例外拋出的測試是這樣子的嗎!!!???
        //測試餘額不足不錯誤拋出,結果拋出後文字有正確顯示出來
        suica5472.charge(3000);

        //測試兌換超額紅利點的數錯誤拋出,結果同上
        suica5472.exchange(20);

    }
}

package idv.workshop.homework;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReverseStringTest {

    @Test
    public void testReverseString() {
        ReverseString reverseString = new ReverseString();
        String input = "壺空怕酌一杯酒,筆下難成和韻詩";
        String excepted = "詩韻和成難下筆,酒杯一酌怕空壺";
        assertEquals(excepted, reverseString.doRevert(input));
    }
}

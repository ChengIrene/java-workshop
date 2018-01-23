package idv.workshop.homework;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class FibonacciRecursiveTest extends FibonacciRecursive {

    @Test
    public void testCreate() {

        //F(0) = 0,   F(1) = 1,   F(2) = 1
        //其他找Fibonacci numbers計算機的答案
        //負數不知道怎麼報錯,先用-1來回報
        assertEquals(-1, fibonacciNumber(-1));
        assertEquals(0, fibonacciNumber(0));
        assertEquals(1, fibonacciNumber(1));
        assertEquals(1, fibonacciNumber(2));
        assertEquals(55, fibonacciNumber(10));
        assertEquals(89, fibonacciNumber(11));
        assertEquals(144, fibonacciNumber(12));
        assertEquals(233, fibonacciNumber(13));

        //12就是極限了,在上去會跑得很慢很慢很慢很慢很慢很慢........真的很慢
    }
}

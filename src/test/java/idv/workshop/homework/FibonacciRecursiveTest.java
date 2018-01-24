package idv.workshop.homework;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class FibonacciRecursiveTest {

    @Test
    public void testCreate() {

        //F(0) = 0,   F(1) = 1,   F(2) = 1
        //其他找Fibonacci numbers計算機的答案
        assertEquals(0, FibonacciRecursive.fibonacciNumber(0));
        assertEquals(1, FibonacciRecursive.fibonacciNumber(1));
        assertEquals(1, FibonacciRecursive.fibonacciNumber(2));
        assertEquals(55, FibonacciRecursive.fibonacciNumber(10));
        //assertEquals(89, FibonacciRecursive.fibonacciNumber(11));
        //assertEquals(144, FibonacciRecursive.fibonacciNumber(12));
        //assertEquals(233, FibonacciRecursive.fibonacciNumber(13));

        //12就是極限了,在上去會跑得很慢很慢很慢很慢很慢很慢........真的很慢
    }

    //例外
    @Test (expected = IllegalArgumentException.class)
    public void testInvalidInput() {
        FibonacciRecursive.fibonacciNumber(-1);
    }
}

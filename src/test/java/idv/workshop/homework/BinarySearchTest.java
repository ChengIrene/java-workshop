package idv.workshop.homework;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BinarySearchTest {

    private int[] input = new int[] {1, 3, 5, 7, 9, 11, 13};

    @Test
    public void testSearchRecursively() {
        assertEquals(1, BinarySearch.searchRecursively(input, 3, 0, input.length));
    }

    @Test
    public void testSearchRecursivelyIfNoMatching() {
        assertEquals(-1, BinarySearch.searchRecursively(input, 2, 0, input.length));
    }

    @Test
    public void testSearchIteratively() {
        assertEquals(2, BinarySearch.searchIteratively(input, 5));
    }

    @Test
    public void testSearchIterativelyIfNoMatching() {
        assertEquals(-1, BinarySearch.searchIteratively(input, 2));
    }
}

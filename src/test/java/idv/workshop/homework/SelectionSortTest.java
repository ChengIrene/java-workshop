package idv.workshop.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    private static int[] input;
    private static int[] exceptedDesc = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    private static int[] exceptedAsc = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Before
    public void init() {
        input = new int[] {2, 4, 6, 1, 7, 9, 3, 8 ,5};
    }

    @After
    public void destroy() {
        input = null;
    }

    @Test
    public void testSortDesc() {
        assertArrayEquals(exceptedDesc, SelectionSort.sortDesc(input));
    }

    @Test
    public void testSortAsc() {
        assertArrayEquals(exceptedAsc, SelectionSort.sortAsc(input));
    }
}

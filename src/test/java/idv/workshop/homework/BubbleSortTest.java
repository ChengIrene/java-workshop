package idv.workshop.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    private static int[] input;
    private int[] exceptedDesc = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
    private int[] exceptAsc = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

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
        assertArrayEquals(exceptedDesc, BubbleSort.sortDesc(input));

        //原來Array用這個方法比較...剛剛還用了for迴圈裡面放assertEquals()...囧爆
    }

    @Test
    public void testSortAsc() {
        assertArrayEquals(exceptAsc, BubbleSort.sortAsc(input));
    }
}

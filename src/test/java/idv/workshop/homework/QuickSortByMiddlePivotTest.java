package idv.workshop.homework;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class QuickSortByMiddlePivotTest {

    @Test
    public void testForNullInput() {

        int[] actual = null;
        QuickSortByMiddlePivot.sort(actual);
        assertNull(actual);  //測試null的方法!!!
    }

    @Test
    public void testForEmptyInput() {

        int[] actual = new int[] {};
        QuickSortByMiddlePivot.sort(actual);
        assertEquals(0, actual.length);
    }

    @Test
    public void testForNormalCase() {

        int[] actual = new int[] {4, 9, 6, 1, 8, 3, 2, 7, 5};
        int[] except = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        QuickSortByMiddlePivot.sort(actual);
        assertEquals(except, actual);
    }
}

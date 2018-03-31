package idv.workshop.homework;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        MergeSort mergeSort = new MergeSort();
        int[] input = new int[] {4, 8, 10, 1, 5, 9, 7};
        int[] excepted = new int[] {1, 4, 5, 7, 8, 9, 10};
        mergeSort.mergeSort(input);

        assertArrayEquals(excepted, input);
    }
}

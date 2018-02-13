package idv.workshop.homework;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GenericsArrayListTest {

    @Test
    public void testCreate() {
        GenericsArrayList<String> test = new GenericsArrayList();
        test.add("0");
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");

        assertEquals(5, test.size());

        assertEquals("0", test.get(0));
        assertEquals("1", test.get(1));
        assertEquals("2", test.get(2));
        assertEquals("3", test.get(3));
        assertEquals("4", test.get(4));
    }
}

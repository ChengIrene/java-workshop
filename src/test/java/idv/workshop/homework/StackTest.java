package idv.workshop.homework;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class StackTest {

    @Test
    public void testCreate() {

        Stack katana = new Stack(5);
        katana.push("Kiyomitsu");
        katana.push("Yasusada");
        katana.push("Kanesada");
        katana.push("Kunihiro");
        katana.push("Kotetsu");

        katana.push("full");
        assertFalse(katana.push("full"));

        assertEquals(5, katana.size());

        assertEquals("Kotetsu", katana.peek());
        assertEquals("Kotetsu", katana.pop());

        assertEquals("Kunihiro", katana.peek());
        assertEquals("Kunihiro", katana.pop());

        assertEquals("Kanesada", katana.peek());
        assertEquals("Kanesada", katana.pop());

        assertEquals("Yasusada", katana.peek());
        assertEquals("Yasusada", katana.pop());

        assertEquals("Kiyomitsu", katana.peek());
        assertEquals("Kiyomitsu", katana.pop());

        assertEquals(0, katana.size());
    }
}

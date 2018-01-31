package idv.workshop.homework;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class BoatTest {

    @Test
    public void testCreate() {
        final String nameOfSaya = "Saya";

        Boat saya = new Boat(nameOfSaya);

        assertEquals(nameOfSaya, saya.getName());

        saya.swim();
    }
}

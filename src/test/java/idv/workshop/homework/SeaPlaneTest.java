package idv.workshop.homework;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class SeaPlaneTest {

    @Test
    public void testCreate() {
        final String nameOfSP = "SP";

        SeaPlane sp = new SeaPlane(nameOfSP);

        assertEquals(nameOfSP, sp.getName());

        sp.fly();
        sp.swim();
    }
}

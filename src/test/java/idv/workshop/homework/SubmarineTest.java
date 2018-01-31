package idv.workshop.homework;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class SubmarineTest {

    @Test
    public void testCreate() {
        final String nameOfYellow = "Yellow";

        Submarine yellow = new Submarine(nameOfYellow);

        assertEquals(nameOfYellow, yellow.getName());

        yellow.dive();
    }
}

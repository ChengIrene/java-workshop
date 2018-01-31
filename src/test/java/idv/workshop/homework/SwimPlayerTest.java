package idv.workshop.homework;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class SwimPlayerTest {

    @Test
    public void testCreate() {
        final String nameOfMutsunokami = "Mutsunokami";

        SwimPlayer mutsunokami = new SwimPlayer(nameOfMutsunokami);

        assertEquals(nameOfMutsunokami, mutsunokami.getName());

        mutsunokami.swim();
    }
}

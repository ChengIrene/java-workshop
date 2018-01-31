package idv.workshop.homework;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class AirplaneTest {

    @Test
    public void testCreate() {
        final String nameOfTsurumaru = "Tsurumaru";

        Airplane tsurumaru = new Airplane(nameOfTsurumaru);

        assertEquals(nameOfTsurumaru, tsurumaru.getName());

        tsurumaru.fly();
    }
}

package idv.workshop.homework;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class HelicopterTest {

    @Test
    public void testCreate() {
        final String nameOfHasebe = "Hasebe";

        Helicopter hasebe = new Helicopter(nameOfHasebe);

        assertEquals(nameOfHasebe, hasebe.getName());

        hasebe.fly();
    }
}

package idv.workshop.homework;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class FlyingFishTest {

    @Test
    public void testCreate() {
        final String nameOfFF = "FF";

        FlyingFish ff = new FlyingFish(nameOfFF);

        assertEquals(nameOfFF, ff.getName());

        ff.fly();
        ff.swim();
    }
}

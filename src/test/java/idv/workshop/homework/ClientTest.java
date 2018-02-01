package idv.workshop.homework;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class ClientTest {

    @Test
    public void testCreate() {
        final String nameOfMidare = "Midare";
        final String ipOfMidare = "123520";

        Client midare = new Client(nameOfMidare, ipOfMidare);

        assertEquals(nameOfMidare, midare.getName());
        assertEquals(ipOfMidare, midare.getIp());
    }
}

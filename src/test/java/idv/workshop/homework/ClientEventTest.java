package idv.workshop.homework;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class ClientEventTest {

    @Test
    public void testCreate() {
        final String nameOfKunihiro = "Kunihiro";
        final String ipOfKunihiro = "1969";

        Client kunihiro = new Client(nameOfKunihiro, ipOfKunihiro);
        ClientEvent c1 = new ClientEvent(kunihiro);

        assertEquals(nameOfKunihiro, kunihiro.getName());
        assertEquals(ipOfKunihiro, kunihiro.getIp());

        assertEquals(nameOfKunihiro, c1.getName());
        assertEquals(ipOfKunihiro, c1.getIp());

    }
}

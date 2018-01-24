package idv.workshop.homework;

import org.junit.Test;

import static idv.workshop.homework.CallByValue.other;
import static idv.workshop.homework.CallByValue.some;
import static junit.framework.TestCase.assertEquals;

public class CallByValueTest {

    @Test
    public void testCreate() {
        final String nameOfKiyomitsu = "Kiyomitsu";
        Customer kiyomitsu = new Customer(nameOfKiyomitsu);

        assertEquals(nameOfKiyomitsu, kiyomitsu.getName());
    }

    @Test
    public void TestCallByValue() {
        Customer yasusada = new Customer("Yasusada");
        some(yasusada);

        assertEquals("Yurio", yasusada.name);

        Customer okita = new Customer("Okita");
        other(okita);

        assertEquals("Okita", okita.name);
    }
}

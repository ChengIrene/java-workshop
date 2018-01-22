package idv.workshop.homework;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class RoleTest {

    @Test
    public void testCreate() {

        final String nameOfKirito = "Kirito";
        final int levelOfKirito = 99;
        final int bloodOfKirito = 9999;

        Role kirito = new Role(nameOfKirito, levelOfKirito, bloodOfKirito);

        assertEquals(nameOfKirito, kirito.getName());
        assertEquals(levelOfKirito, kirito.getLevel());
        assertEquals(bloodOfKirito, kirito.getBlood());

        final String nameOfAsuna = "Asuna";
        final int levelOfAsuna = 70;
        final int bloodOfAsuna = 7000;

        Role asuna = new Role(nameOfAsuna, levelOfAsuna, bloodOfAsuna);

        assertEquals(nameOfAsuna, asuna.getName());
        assertEquals(levelOfAsuna, asuna.getLevel());
        assertEquals(bloodOfAsuna, asuna.getBlood());
    }
}

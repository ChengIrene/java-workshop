package idv.workshop.homework;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {

    @Test
    public void testCreate(){
        final String nameOfYuri = "Yuri";
        final int ageOfYuri = 5;
        final int weightOfYuri = 10;
        final String colorOfYuri = "blue";
        final String genderOfYuri = "male";

        Cat yuri = new Cat(nameOfYuri, ageOfYuri, weightOfYuri, colorOfYuri, genderOfYuri);

        assertEquals(nameOfYuri, yuri.getName());
        assertEquals(ageOfYuri, yuri.getAge());
        assertEquals(weightOfYuri, yuri.getWeight());
        assertEquals(colorOfYuri, yuri.getWeight());
        assertEquals(genderOfYuri, yuri.getGender());
        assertTrue(yuri.isMale());

        final String nameOfYurio = "Yurio";
        final int ageOfYurio = 3;
        final int weightOfYurio = 4;
        final String colorOfYurio = "yellow";
        final String genderOfYurio = "female";

        Cat yurio = new Cat(nameOfYurio, ageOfYurio, weightOfYurio, colorOfYurio, genderOfYurio);

        assertEquals(nameOfYurio, yurio.getName());
        assertEquals(ageOfYurio, yurio.getAge());
        assertEquals(weightOfYurio, yurio.getWeight());
        assertEquals(colorOfYurio, yurio.getColor());
        assertEquals(genderOfYurio, yurio.getGender());
        assertFalse(yurio.isMale());
    }
}

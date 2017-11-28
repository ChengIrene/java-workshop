package idv.workshop.homework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatTest {

    @Test
    public void testCreate(){
        final String nameOfYuri = "Yuri";
        final int ageOfYuri = 5;
        final int weightOfYuri = 10;
        final String colorOfYuri = "blue";
        final String genderOfYuri = "male";

        Cat yuri = new Cat(nameOfYuri, 5, 10, "blue", "male");

        assertEquals(nameOfYuri, yuri.getName());
        assertEquals(ageOfYuri, yuri.getAge());
        assertEquals(weightOfYuri, yuri.getWeight());
        assertEquals(colorOfYuri, yuri.getWeight());
        assertEquals(genderOfYuri, yuri.getGender());

        final String nameOfYurio = "Yurio";
        final int ageOfYurio = 3;
        final int weightOfYurio = 4;
        final String colorOfYurio = "yellow";
        final String genderOfYurio = "male";

        Cat yurio = new Cat("Yurio", 3, 4, "yellow", "male");

        assertEquals(nameOfYurio, yurio.getName());
        assertEquals(ageOfYurio, yurio.getAge());
        assertEquals(weightOfYurio, yurio.getWeight());
        assertEquals(colorOfYurio, yurio.getColor());
        assertEquals(genderOfYurio, yurio.getGender());
    }
}

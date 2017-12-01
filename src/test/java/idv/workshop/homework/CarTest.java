package idv.workshop.homework;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CarTest {

    @Test
    public void testCreate(){
        final String brandOfSubaru = "Subaru";
        final String colorOfSubaru = "blus";
        final int generationOfSubaru = 100;
        final int carAgeOfSubaru = 3;
        final int numberOfWheelOfSubaru = 4;
        final boolean hasWeaponOfSubaru = true;
        final String weaponNameOfSubaru = "Japanese sword";
        final int maxSpeedOfSubaru = 220;

        Car subaru = new Car(brandOfSubaru, colorOfSubaru, generationOfSubaru, carAgeOfSubaru, numberOfWheelOfSubaru, hasWeaponOfSubaru, weaponNameOfSubaru, maxSpeedOfSubaru);

        assertEquals(brandOfSubaru, subaru.getBrand());
        assertEquals(colorOfSubaru, subaru.getColor());
        assertEquals(generationOfSubaru, subaru.getGeneration());
        assertEquals(carAgeOfSubaru, subaru.getCarAge());
        assertEquals(numberOfWheelOfSubaru, subaru.getNumberOfWheel());
        assertTrue(subaru.isHasWeapon());
        assertEquals(weaponNameOfSubaru, subaru.getWeaponName());
        assertEquals(maxSpeedOfSubaru, subaru.getMaxSpeed());

        assertTrue(subaru.hasFourWheel());
        assertTrue(subaru.isRacingCar());
        assertFalse(subaru.isOldGenerationCar());
        assertFalse(subaru.isOldAgeCar());

    }
}

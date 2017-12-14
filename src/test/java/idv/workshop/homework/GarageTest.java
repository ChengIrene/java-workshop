package idv.workshop.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GarageTest {

    // @BeforeClass: Do some preparation works that are global(before all test method start).
    // @AfterClass: Do some finish operations that are global(before all test method finished).
    // @Before: Do something before every test method.
    // @After: Do something after every test method.

    private Car car1;
    private Car car2;
    private Car car3;

    @Before
    public void init() {
        car1 = new Car("Toyota", "green", 80, 20, 4, false, "no weapon", 180);
        car2 = new Car("Mitsubishi", "black", 70, 20, 4, false, "no weapon", 180);
        car3 = new Car("Nissan", "gary", 90, 10, 4, false, "no weapon", 190);
    }

    @After
    public void clear() {
        car1 = null;
        car2 = null;
        car3 = null;
    }

    @Test
    public void testCreate() {
        Garage garage = new Garage();
        assertEquals(0, garage.getNumberOfCars());
    }

    @Test
    public void testAddCarIntoGarage() {
        Garage garage = new Garage();

        // 1.TOYOTA
        // add into array
        garage.park(car1);
        assertEquals(1, garage.getNumberOfCars());

        ArrayList<Car> allCars = garage.getAllCars();
        assertEquals(1, allCars.size());

        assertEquals(car1, allCars.get(0));

        // 2.MITSUBISHI
        // add into array
        garage.park(car2);
        assertEquals(2, garage.getNumberOfCars());
        assertEquals(2, allCars.size());
        assertEquals(car1, allCars.get(0));
        assertEquals(car2, allCars.get(1));

        // 3.NISSAN
        // add into array
        garage.park(car3);
        assertEquals(3, garage.getNumberOfCars());
        assertEquals(3, allCars.size());
        assertEquals(car1, allCars.get(0));
        assertEquals(car2, allCars.get(1));
        assertEquals(car3, allCars.get(2));
    }

    @Test
    public void testRemoveCarFromGarage() {
        Garage garage = new Garage();

        // Car1:TOYOTA
        // add into array
        garage.park(car1);
        // Car2:MITSUBISHI
        // add into array
        garage.park(car2);
        // Car3:NISSAN
        // add into array
        garage.park(car3);

        // remove cars from array
        garage.remove(car1);
        garage.remove(car2);
        garage.remove(car3);
        assertFalse(garage.isCarPresent(car1));
        assertFalse(garage.isCarPresent(car2));
        assertFalse(garage.isCarPresent(car3));
    }

    @Test
    public void testRemoveSpecifiedCarsFromGarage() {
        Garage garage = new Garage();

        // Car1:TOYOTA
        // add into array
        garage.park(car1);
        // Car2:MITSUBISHI
        // add into array
        garage.park(car2);
        // Car3:NISSAN
        // add into array
        garage.park(car3);

        // create a new list
        List<Car> removedList = new ArrayList<>();
        // Suppose we want to remove car1 and car3
        removedList.add(car1);
        removedList.add(car3);

        // remove all cars from array
        assertTrue(garage.removeCars(removedList));
        assertEquals(1, garage.getNumberOfCars());
        assertEquals(car2, garage.getAllCars().get(0));
    }

    @Test
    public void testIsCarPresent() {
        Garage garage = new Garage();

        // Car1:TOYOTA
        // add into array
        garage.park(car1);
        // Car2:MITSUBISHI
        // add into array
        garage.park(car2);
        // Car3:NISSAN
        // add into array
        garage.park(car3);

        assertTrue(garage.isCarPresent(car1));
        assertTrue(garage.isCarPresent(car2));
        assertTrue(garage.isCarPresent(car3));
    }

    @Test
    public void testGetIndexOfCar() {
        Garage garage = new Garage();

        // Car1:TOYOTA
        // add into array
        garage.park(car1);
        // Car2:MITSUBISHI
        // add into array
        garage.park(car2);
        // Car3:NISSAN
        // add into array
        garage.park(car3);

        assertEquals(0, garage.getIndexOf(car1));
        assertEquals(1, garage.getIndexOf(car2));
        assertEquals(2, garage.getIndexOf(car3));
    }

    @Test
    public void testGarageIsEmpty() {
        Garage garage = new Garage();

        // Car1:TOYOTA
        // add into array
        garage.park(car1);
        // Car2:MITSUBISHI
        // add into array
        garage.park(car2);
        // Car3:NISSAN
        // add into array
        garage.park(car3);

        assertFalse(garage.isEmpty());
    }

    @Test
    public void testRemoveAll() {
        Garage garage = new Garage();

        // Car1:TOYOTA
        // add into array
        garage.park(car1);
        // Car2:MITSUBISHI
        // add into array
        garage.park(car2);
        // Car3:NISSAN
        // add into array
        garage.park(car3);

        garage.removeAll();
        assertEquals(0, garage.getNumberOfCars());
        assertTrue(garage.isEmpty());
    }
}